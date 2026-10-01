package o;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.sf.scuba.smartcards.BuildConfig;
import o.enableCppPropsIteratorSetter;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class enableCppPropsIteratorSetter$IAuthTabCallbackStub extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enableCppPropsIteratorSetter$IAuthTabCallbackStub(Object obj, access13800<? super enableCppPropsIteratorSetter$IAuthTabCallbackStub> access13800Var) {
        super(access13800Var);
        this.this$0 = obj;
    }

    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        Object obj2 = this.this$0;
        try {
            Object[] objArr = {null, null, this};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2100744515);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 30 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), 24887 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1282813907, false, "onWarmupCompleted", new Class[]{GraniteBrownfieldModule_closeView.class, enableCppPropsIteratorSetter.onExtraCallbackWithResult.class, access13800.class});
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
