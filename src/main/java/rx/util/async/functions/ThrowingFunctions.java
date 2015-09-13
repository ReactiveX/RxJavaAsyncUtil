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

import java.util.concurrent.Callable;

/**
 * Helper methods for converting throwing functions into Callables
 */
public class ThrowingFunctions {
    private ThrowingFunctions() {
        throw new IllegalStateException("No instances!");
    }
    
    /**
     * Converts a throwing function and its argument into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the input to apply to the throwing function
     * @return A callable that when called will apply the provided argument to the provided throwing function
     */
    public static <T1, R> Callable<R> toCallable(final ThrowingFunc1<? super T1, ? extends R> func, final T1 t1)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, R> Callable<R> toCallable(final ThrowingFunc2<? super T1, ? super T2, ? extends R> func, final T1 t1, final T2 t2)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, R> Callable<R> toCallable(final ThrowingFunc3<? super T1, ? super T2, ? super T3, ? extends R> func, final T1 t1, final T2 t2, final T3 t3)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @param t4 the fourth input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, T4, R> Callable<R> toCallable(final ThrowingFunc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func, final T1 t1, final T2 t2, final T3 t3, final T4 t4)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3, t4);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @param t4 the fourth input to apply to the throwing function
     * @param t5 the fifth input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, T4, T5, R> Callable<R> toCallable(final ThrowingFunc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func, final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3, t4, t5);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the fifth parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @param t4 the fourth input to apply to the throwing function
     * @param t5 the fifth input to apply to the throwing function
     * @param t6 the sixth input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, T4, T5, T6, R> Callable<R> toCallable(final ThrowingFunc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func, final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3, t4, t5, t6);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @param t4 the fourth input to apply to the throwing function
     * @param t5 the fifth input to apply to the throwing function
     * @param t6 the sixth input to apply to the throwing function
     * @param t7 the seventh input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, T4, T5, T6, T7, R> Callable<R> toCallable(final ThrowingFunc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func, final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3, t4, t5, t6, t7);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @param t4 the fourth input to apply to the throwing function
     * @param t5 the fifth input to apply to the throwing function
     * @param t6 the sixth input to apply to the throwing function
     * @param t7 the seventh input to apply to the throwing function
     * @param t8 the eighth input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Callable<R> toCallable(final ThrowingFunc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func, final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3, t4, t5, t6, t7, t8);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its arguments into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <T9> the ninth parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param t1 the first input to apply to the throwing function
     * @param t2 the second input to apply to the throwing function
     * @param t3 the third input to apply to the throwing function
     * @param t4 the fourth input to apply to the throwing function
     * @param t5 the fifth input to apply to the throwing function
     * @param t6 the sixth input to apply to the throwing function
     * @param t7 the seventh input to apply to the throwing function
     * @param t8 the eighth input to apply to the throwing function
     * @param t9 the ninth input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Callable<R> toCallable(final ThrowingFunc9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func, final T1 t1, final T2 t2, final T3 t3, final T4 t4, final T5 t5, final T6 t6, final T7 t7, final T8 t8, final T9 t9)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
	    }
	};
    }
    
    /**
     * Converts a throwing function and its argument into a {@link Callable}.
     * 
     * @param <T1> the first parameter type
     * @param <R> the result type
     * @param func a throwing function to convert into a callable
     * @param args the input to apply to the throwing function
     * @return A callable that when called will apply the provided arguments to the provided throwing function
     */
    public static <R> Callable<R> toCallable(final ThrowingFuncN<? extends R> func, final Object... args)
    {
	return new Callable<R>() {
	    @Override
	    public R call() throws Exception {
		return func.call(args);
	    }
	};
    }
}
