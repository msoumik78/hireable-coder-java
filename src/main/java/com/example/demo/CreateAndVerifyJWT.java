package com.example.demo;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.gen.RSAKeyGenerator;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import java.text.ParseException;
import java.util.Date;

public class CreateAndVerifyJWT {
  public static void main(String[] args) throws Exception{
    RSAKey rsaJWK = new RSAKeyGenerator(2048)
      .keyID("123")
      .generate();
    JWSSigner signer = new RSASSASigner(rsaJWK);

    String jwtAsString = createJWT(rsaJWK, signer);
    System.out.println("JWT : "+jwtAsString);
    //Thread.sleep(5000);
    System.out.println("JWT valid : " + validateJWT(rsaJWK, jwtAsString));
  }

  private static String createJWT(RSAKey rsaJWK, JWSSigner signer) throws JOSEException {
    JWTClaimsSet claimsSet = new JWTClaimsSet.Builder()
      .issuer("https://c2id.com")
      .claim("userId", "msoumik78")
      .claim("role", "customer")
      .expirationTime(new Date(new Date().getTime() + 2 * 1000))
      .build();

    SignedJWT signedJWT = new SignedJWT(
      new JWSHeader.Builder(JWSAlgorithm.RS256).keyID(rsaJWK.getKeyID()).build(),
      claimsSet);
    signedJWT.sign(signer);
    return signedJWT.serialize();
  }

  private static boolean validateJWT(RSAKey rsaJWK, String jwtAsString) throws ParseException, JOSEException {
    SignedJWT parsedJWT = SignedJWT.parse(jwtAsString);
    RSAKey rsaPublicJWK = rsaJWK.toPublicJWK();
    JWSVerifier verifier = new RSASSAVerifier(rsaPublicJWK);
    if (!parsedJWT.verify(verifier)) {
      return false;
    }
    Date certificateExpiryTime = parsedJWT.getJWTClaimsSet().getExpirationTime();
    Date currentTime = new Date();
    return !currentTime.after(certificateExpiryTime);
  }

}
