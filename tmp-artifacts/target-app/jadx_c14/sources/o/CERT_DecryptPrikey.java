package o;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.getIv6;
import o.toRealPath;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CERT_DecryptPrikey extends toRealPath {
    private boolean IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final onWarmupCompleted IAuthTabCallbackStub;
    private int asBinder;
    private getNativeModuleIteratorReactAndroid_release asInterface;
    private long onExtraCallback;
    private final Context onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private handleCxxError onTransact;
    private onDisclaimerClick onWarmupCompleted;

    public interface onWarmupCompleted extends getIv6.onNavigationEvent {
        void ICustomTabsServiceStub();

        void ICustomTabsServiceStubProxy();

        void access200();

        void onExtraCallbackWithResult(@NotNull CharSequence charSequence);

        void onExtraCallbackWithResult(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint);

        void onWarmupCompleted(@NotNull String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CERT_DecryptPrikey(@NotNull Context context, @NotNull onWarmupCompleted onwarmupcompleted, @NotNull onDisclaimerClick ondisclaimerclick, @Nullable getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release) {
        super(toRealPath.onNavigationEvent.HEADER);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        this.onExtraCallbackWithResult = context;
        this.IAuthTabCallbackStub = onwarmupcompleted;
        this.onWarmupCompleted = ondisclaimerclick;
        this.asInterface = getnativemoduleiteratorreactandroid_release;
        this.onExtraCallback = KeyBoardVisiblePoint.onExtraCallback(ondisclaimerclick, 0L, 1, (Object) null);
        this.asBinder = 16;
    }

    public final handleCxxError onTransact() {
        return this.onTransact;
    }

    private final boolean writeTypedObject() {
        return this.onTransact == null && !this.onWarmupCompleted.ICustomTabsCallbackStubProxy();
    }

    public final boolean asInterface() {
        return this.onTransact != null || writeTypedObject();
    }

    public final void IAuthTabCallback(boolean z) {
        this.IAuthTabCallback = z;
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.onWarmupCompleted);
    }

    public long onWarmupCompleted() {
        String strOnExtraCallbackWithResult = this.onWarmupCompleted.onExtraCallbackWithResult();
        handleCxxError handlecxxerror = this.onTransact;
        String strOnExtraCallbackWithResult2 = handlecxxerror != null ? handlecxxerror.onExtraCallbackWithResult() : null;
        return ("toss-header-" + strOnExtraCallbackWithResult + "-" + strOnExtraCallbackWithResult2).hashCode();
    }

    public final void onExtraCallbackWithResult(long j) {
        this.onExtraCallback = j;
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.IAuthTabCallback);
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.onNavigationEvent);
        this.onNavigationEvent = true;
    }

    public final boolean asBinder() {
        if (this.onWarmupCompleted.access000()) {
            return (this.asInterface != null || PlayerErrorCode.writeTypedObject() <= this.asBinder) && !addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted);
        }
        return false;
    }

    public final boolean access100() {
        return !this.onWarmupCompleted.onMinimized() && KeyBoardVisiblePoint.IAuthTabCallback(this.onWarmupCompleted, 0L, 1, (Object) null) > 0;
    }

    public final boolean getInterfaceDescriptor() {
        return (this.onWarmupCompleted.ICustomTabsCallbackDefault() || this.onWarmupCompleted.ICustomTabsCallbackStubProxy() || !addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted)) ? false : true;
    }

    public final boolean access000() {
        return !addExtra.IAuthTabCallback(PlayerErrorCode.onWarmupCompleted) && this.onWarmupCompleted.access000();
    }

    public final TdsButtonV1View.asInterface onNavigationEvent() {
        return new TdsButtonV1View.asInterface((TdsButtonV1View.IAuthTabCallbackStub) null, this.IAuthTabCallback ? TdsButtonV1View.IAuthTabCallbackDefault.WEAK : TdsButtonV1View.IAuthTabCallbackDefault.FILL, (TdsButtonV1View.onWarmupCompleted) null, (TdsButtonV1View.IAuthTabCallback) null, 13, (DefaultConstructorMarker) null);
    }

    public final String IAuthTabCallbackDefault() {
        allowsInstagramAppAuth cardImage;
        String frontSmallImageUrl;
        getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release = this.asInterface;
        return (getnativemoduleiteratorreactandroid_release == null || (cardImage = getnativemoduleiteratorreactandroid_release.getCardImage()) == null || (frontSmallImageUrl = cardImage.getFrontSmallImageUrl()) == null) ? getNativeModuleIteratorReactAndroid_release.CLEAR_BLACK.getCardImage().getFrontSmallImageUrl() : frontSmallImageUrl;
    }

    public final boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallbackDefault;
    }

    public final void onWarmupCompleted(boolean z) {
        this.IAuthTabCallbackDefault = z;
    }

    public final void onNavigationEvent(@NotNull onDisclaimerClick ondisclaimerclick) {
        Intrinsics.checkNotNullParameter(ondisclaimerclick, "");
        this.onWarmupCompleted = ondisclaimerclick;
        onExtraCallbackWithResult(KeyBoardVisiblePoint.onExtraCallback(ondisclaimerclick, 0L, 1, (Object) null));
    }

    public final void onNavigationEvent(@NotNull handleCxxError handlecxxerror) {
        Intrinsics.checkNotNullParameter(handlecxxerror, "");
        this.onTransact = handlecxxerror;
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.onExtraCallbackWithResult);
    }

    public final void IAuthTabCallback(@Nullable getNativeModuleIteratorReactAndroid_release getnativemoduleiteratorreactandroid_release) {
        this.asInterface = getnativemoduleiteratorreactandroid_release;
        onExtraCallback(ContextMenuUiKtExternalSyntheticLambda0.IAuthTabCallbackStub);
    }

    public final void onWarmupCompleted(int i) {
        this.asBinder = i;
    }

    public final boolean IAuthTabCallback_Parcel() {
        return this.onWarmupCompleted.ICustomTabsCallbackStubProxy();
    }

    public final Pair<Long, Boolean> onExtraCallback() {
        return getWrite.IAuthTabCallback(Long.valueOf(this.onExtraCallback), Boolean.valueOf(this.onNavigationEvent));
    }

    public final void extraCallbackWithResult() {
        this.IAuthTabCallbackStub.ICustomTabsServiceStub();
    }

    public final void extraCallback() {
        this.IAuthTabCallbackStub.ICustomTabsServiceStubProxy();
    }

    public final void readTypedObject() {
        this.IAuthTabCallbackStub.onExtraCallbackWithResult((KeyBoardVisiblePoint) this.onWarmupCompleted);
    }

    public final void IAuthTabCallbackStubProxy() {
        handleCxxError handlecxxerror = this.onTransact;
        if (handlecxxerror != null) {
            onWarmupCompleted onwarmupcompleted = this.IAuthTabCallbackStub;
            String strOnExtraCallback = handlecxxerror != null ? handlecxxerror.onExtraCallback() : null;
            handleCxxError handlecxxerror2 = this.onTransact;
            onwarmupcompleted.onWarmupCompleted(strOnExtraCallback + " " + (handlecxxerror2 != null ? handlecxxerror2.onExtraCallbackWithResult() : null));
            return;
        }
        if (writeTypedObject()) {
            this.IAuthTabCallbackStub.onExtraCallbackWithResult((String) issueCertV3.onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 212427218, new Object[]{this.onWarmupCompleted}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()));
        }
    }

    public final void ICustomTabsCallback() {
        this.IAuthTabCallbackStub.access200();
    }

    public final CharSequence IAuthTabCallback() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.onTransact == null) {
            if (this.onWarmupCompleted.access000()) {
                spannableStringBuilder.append((CharSequence) this.onExtraCallbackWithResult.getString(R.string.app_account_detail_viewmodel_header___b025a34c23));
            } else if (this.onWarmupCompleted.ICustomTabsCallbackDefault()) {
                spannableStringBuilder.append((CharSequence) this.onExtraCallbackWithResult.getString(R.string.app_account_detail_viewmodel_header___c89d898712));
            } else if (this.onWarmupCompleted.ICustomTabsCallbackStubProxy()) {
                spannableStringBuilder.append((CharSequence) this.onExtraCallbackWithResult.getString(R.string.app_account_detail_viewmodel_header___fd74bba640));
            } else {
                spannableStringBuilder.append((CharSequence) issueCertV3.onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 212427218, new Object[]{this.onWarmupCompleted}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult()));
            }
        } else {
            UnderlineSpan underlineSpan = new UnderlineSpan();
            int length = spannableStringBuilder.length();
            Context context = this.onExtraCallbackWithResult;
            int i = R.string.app_account_detail_viewmodel_header___66d3d44f3c;
            handleCxxError handlecxxerror = this.onTransact;
            String strOnExtraCallback = handlecxxerror != null ? handlecxxerror.onExtraCallback() : null;
            handleCxxError handlecxxerror2 = this.onTransact;
            String string = context.getString(i, strOnExtraCallback, handlecxxerror2 != null ? handlecxxerror2.onExtraCallbackWithResult() : null);
            Intrinsics.checkNotNullExpressionValue(string, "");
            spannableStringBuilder.append(mergeParams.IAuthTabCallback(string, false, 1, (Object) null));
            spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        }
        if (writeTypedObject()) {
            spannableStringBuilder.append((CharSequence) " \ue025");
        }
        return new SpannedString(spannableStringBuilder);
    }
}
