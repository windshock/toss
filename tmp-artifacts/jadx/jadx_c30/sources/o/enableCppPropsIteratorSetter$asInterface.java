package o;

import android.content.Context;
import android.graphics.Color;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$asInterface extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$asInterface(Object obj, access13800<? super enableCppPropsIteratorSetter$asInterface> access13800Var) {
        super(access13800Var);
        this.this$0 = obj;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object obj2 = this.this$0;
        try {
            Object[] objArr = {null, null, null, null, false, null, false, this};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(666171985);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), AndroidCharacter.getMirror('0') - 18, (-16752329) - Color.rgb(0, 0, 0), 385090753, false, "onExtraCallback", new Class[]{Context.class, String.class, String.class, String.class, Boolean.TYPE, asArray.class, Boolean.TYPE, access13800.class});
            }
            return ((Method) objOnExtraCallback).invoke(obj2, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
