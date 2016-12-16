package test;

import static org.mockito.Mockito.*;

final class FinalClass {
  int m1() {
    throw new RuntimeException("42");
  }
}

public class TestMockFinal {
  public static void main(String[] args) {
	System.out.println("java.home=" + System.getProperty("java.home"));  
    FinalClass cl = mock(FinalClass.class);
    when(cl.m1()).thenReturn(-1);
    if (cl.m1() != -1) {
      throw new Error("Not mocked!");
    }
	System.out.println("Done!");
  }
}