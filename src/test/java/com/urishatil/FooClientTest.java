package com.urishatil;

import static org.mockito.Mockito.*;

import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FooClientTest {

  @Mock
  private FooClient fooClient;

  @Test
  public void testPasses() {
    expectFoo(5, new Foo(5, Optional.empty()));

    fooClient.getFoo(5);
  }

  @Test
  public void testFails() {
    expectFoo(6, new Foo(6, Optional.empty()));
  }

  private void expectFoo(int id, Foo foo) {
    when(fooClient.getFoo(eq(id))).thenReturn(foo);
  }
}
