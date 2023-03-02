package kt_03

import okhttp3.internal.http2.Http2Connection.Listener
import rx.functions.Func1

class TestInvoke {
    private var mSingleListener:((Int) -> Unit)?= null

    public fun setSingleListener(listener:((Int) -> Unit)?){
        this.mSingleListener = listener
    }
    fun testRun(){
        mSingleListener?.invoke(100)
        if(mSingleListener != null){
            mSingleListener!!(100)
        }
    }

}
//注意，这里接口的方法就是invoke
public interface Function1<in P1, out R> : Function<R> {
    /** Invokes the function with the specified argument. */
    public operator fun invoke(p1: P1): R
}


fun main() {
    val function = object :Function1<Int,Unit>{
        override fun invoke(p1: Int) {
            println(p1)
        }
    }
    val testInvoke = TestInvoke()
    //testInvoke.setSingleListener(function)
    testInvoke.testRun()
}