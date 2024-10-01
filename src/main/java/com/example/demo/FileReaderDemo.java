package com.example.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileReaderDemo {
  public static void main(String[] args) throws IOException {
    // Change the below full path to an existing path in your system
    String fileName = "/Users/msoumik/city-measurements2.txt";
    createFile(fileName);
    readUsingMMapFile(fileName);
    readFileNormally(fileName);
  }

  private static void createFile(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
    // Replace the file path in the below line
    PrintWriter writer = new PrintWriter(fileName, "UTF-8");
    for (int i =1; i <= 10000000; i++) {
      writer.println("City"+i+":"+50);
    }
    writer.close();
    System.out.println("File created");
  }

  private static void readFileNormally(String fileName) throws IOException {
    long startTime = System.currentTimeMillis();
      try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
          String line = br.readLine();
          while (line != null) {
              // Uncomment below line to print each line of file
              //System.out.println(line);
              line = br.readLine();
          }
      }
      System.out.println("Total time taken to read file normally : "+(System.currentTimeMillis() - startTime));
  }

  private static void readUsingMMapFile(String fileName) throws IOException {
    long startTime = System.currentTimeMillis();
    try (RandomAccessFile file = new RandomAccessFile(new File(fileName), "r"))
    {
      FileChannel fileChannel = file.getChannel();
      MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
      for (int i = 0; i < buffer.limit(); i++)
      {
        // Uncomment below line to print each line of file
        //System.out.print((char) buffer.get());

      }
    }
    System.out.println("Total time taken to read file using mmap : " + (System.currentTimeMillis() - startTime));
  }
}
