/**
 * Copyright 2015 Netflix, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rx.util.async.functions;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class ThrowingFunctionsTest {
    @Test
    public void testThrowingFunc1ToCallable() throws Exception {
        ThrowingFunc1<String, String> func = Mockito.mock(ThrowingFunc1.class);
        
        ThrowingFunctions.toCallable(func, "First")
                         .call();
        
        Mockito.verify(func).call("First");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc1ToCallableThrows() throws Exception {
        ThrowingFunc1<String, String> func = Mockito.mock(ThrowingFunc1.class);
        when(func.call(Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First")
                         .call();
        
        Mockito.verify(func).call("First");
    }
    
    @Test
    public void testThrowingFunc2ToCallableThrows() throws Exception {
        ThrowingFunc2<String, String, String> func = Mockito.mock(ThrowingFunc2.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second")
                         .call();
        
        Mockito.verify(func).call("First", "Second");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc2ToCallable() throws Exception {
        ThrowingFunc2<String, String, String> func = Mockito.mock(ThrowingFunc2.class);
        when(func.call(Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second")
                         .call();
        
        Mockito.verify(func).call("First", "Second");
    }
    
    @Test
    public void testThrowingFunc3ToCallable() throws Exception {
        ThrowingFunc3<String, String, String, String> func = Mockito.mock(ThrowingFunc3.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc3ToCallableThrows() throws Exception {
        ThrowingFunc3<String, String, String, String> func = Mockito.mock(ThrowingFunc3.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third");
    }
    
    @Test
    public void testThrowingFunc4ToCallable() throws Exception {
        ThrowingFunc4<String, String, String, String, String> func = Mockito.mock(ThrowingFunc4.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc4ToCallableThrows() throws Exception {
        ThrowingFunc4<String, String, String, String, String> func = Mockito.mock(ThrowingFunc4.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth");
    }
    
    @Test
    public void testThrowingFunc5ToCallable() throws Exception {
        ThrowingFunc5<String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc5.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc5ToCallableThrows() throws Exception {
        ThrowingFunc5<String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc5.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth");
    }
    
    @Test
    public void testThrowingFunc6ToCallable() throws Exception {
        ThrowingFunc6<String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc6.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc6ToCallableThrows() throws Exception {
        ThrowingFunc6<String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc6.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth");
    }
    
    @Test
    public void testThrowingFunc7ToCallable() throws Exception {
        ThrowingFunc7<String, String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc7.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc7ToCallableThrows() throws Exception {
        ThrowingFunc7<String, String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc7.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh");
    }
    
    @Test
    public void testThrowingFunc8ToCallable() throws Exception {
        ThrowingFunc8<String, String, String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc8.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc8ToCallableThrows() throws Exception {
        ThrowingFunc8<String, String, String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc8.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth");
    }
    
    @Test
    public void testThrowingFunc9ToCallable() throws Exception {
        ThrowingFunc9<String, String, String, String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc9.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFunc9ToCallableThrows() throws Exception {
        ThrowingFunc9<String, String, String, String, String, String, String, String, String, String> func = Mockito.mock(ThrowingFunc9.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth");
    }
    
    @Test
    public void testThrowingFuncNToCallable() throws Exception {
        ThrowingFuncN<String> func = Mockito.mock(ThrowingFuncN.class);
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth");
    }
    
    @Test(expected=Exception.class)
    public void testThrowingFuncNToCallableThrows() throws Exception {
        ThrowingFuncN<String> func = Mockito.mock(ThrowingFuncN.class);
        when(func.call(Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString(), Mockito.anyString())).thenThrow(new Exception());
        
        ThrowingFunctions.toCallable(func, "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth")
                         .call();
        
        Mockito.verify(func).call("First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth");
    }
}
