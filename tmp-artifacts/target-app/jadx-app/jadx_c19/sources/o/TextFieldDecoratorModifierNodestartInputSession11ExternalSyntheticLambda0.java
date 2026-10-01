package o;

import androidx.annotation.Nullable;
import com.google.common.primitives.Floats;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final float IAuthTabCallback;
    public final float onExtraCallbackWithResult;

    public TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0(float f, float f2) {
        RecordingInputConnection_androidKt.onExtraCallback(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.IAuthTabCallback = f;
        this.onExtraCallbackWithResult = f2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0 textFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0 = (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0) obj;
        return this.IAuthTabCallback == textFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0.IAuthTabCallback && this.onExtraCallbackWithResult == textFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda0.onExtraCallbackWithResult;
    }

    public int hashCode() {
        return ((Floats.hashCode(this.IAuthTabCallback) + 527) * 31) + Floats.hashCode(this.onExtraCallbackWithResult);
    }

    public String toString() {
        return "xyz: latitude=" + this.IAuthTabCallback + ", longitude=" + this.onExtraCallbackWithResult;
    }
}
