package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.LiveCheckConstants;
import java.lang.reflect.Method;
import kotlin.Pair;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class track {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int extraCallback = 0;
    private static int onActivityLayout = 1;
    private final getCausesCount<Float> IAuthTabCallback;
    private final getCausesCount<Float> IAuthTabCallbackDefault;
    private final getCausesCount<Float> IAuthTabCallbackStub;
    private getCausesCount<AnimUtils> IAuthTabCallbackStubProxy;
    private final getCausesCount<Float> access100;
    private final getCausesCount<Float> asBinder;
    private final getCausesCount<Float> asInterface;
    private final getCausesCount<Float> getInterfaceDescriptor;
    private final getCausesCount<Pair<Float, Float>> onExtraCallback;
    private final getCausesCount<Double> onExtraCallbackWithResult;
    private final getCausesCount<Double> onNavigationEvent;
    private final getCausesCount<Float> onTransact;
    private final getCausesCount<Float> onWarmupCompleted;
    private static char[] access000 = {64992, 64963, 65020, 64927, 64961, 64981, 64977, 64997, 64915, 65017, 64980, 65008, 64970, 65019, 65016, 64966, 64962, 64967, 64960, 64998, 64989, 64983, 64978, 64988, 64923, 64999, 64991, 65018, 64982, 64995, 64986, 64910, 64994, 64996, 64976, 65021};
    private static char IAuthTabCallback_Parcel = 51247;
    private static char readTypedObject = 59846;
    private static char extraCallbackWithResult = 65176;
    private static char writeTypedObject = 50663;
    private static char ICustomTabsCallback = 32775;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!(r6 instanceof o.track)) == true) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r6 = (o.track) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackStubProxy, r6.IAuthTabCallbackStubProxy) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r6 = o.track.extraCallback + 69;
        o.track.onActivityLayout = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if ((r6 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onTransact, r6.onTransact) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.access100, r6.access100) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackStub, r6.IAuthTabCallbackStub) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getInterfaceDescriptor, r6.getInterfaceDescriptor) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        r6 = o.track.extraCallback + 117;
        o.track.onActivityLayout = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.asBinder, r6.asBinder)) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b2, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackDefault, r6.IAuthTabCallbackDefault)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.asInterface, r6.asInterface) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        r6 = o.track.extraCallback + 67;
        o.track.onActivityLayout = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c8, code lost:
    
        if ((r6 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 73;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        getCausesCount<AnimUtils> getcausescount = this.IAuthTabCallbackStubProxy;
        int iHashCode3 = getcausescount == null ? 0 : getcausescount.hashCode();
        getCausesCount<Pair<Float, Float>> getcausescount2 = this.onExtraCallback;
        int iHashCode4 = getcausescount2 == null ? 0 : getcausescount2.hashCode();
        getCausesCount<Double> getcausescount3 = this.onExtraCallbackWithResult;
        if (getcausescount3 == null) {
            int i2 = extraCallback + 113;
            onActivityLayout = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = getcausescount3.hashCode();
        }
        getCausesCount<Double> getcausescount4 = this.onNavigationEvent;
        int iHashCode5 = getcausescount4 == null ? 0 : getcausescount4.hashCode();
        getCausesCount<Float> getcausescount5 = this.onTransact;
        int iHashCode6 = getcausescount5 == null ? 0 : getcausescount5.hashCode();
        getCausesCount<Float> getcausescount6 = this.access100;
        if (getcausescount6 == null) {
            int i4 = onActivityLayout + 55;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = getcausescount6.hashCode();
        }
        getCausesCount<Float> getcausescount7 = this.IAuthTabCallbackStub;
        int iHashCode7 = getcausescount7 == null ? 0 : getcausescount7.hashCode();
        getCausesCount<Float> getcausescount8 = this.getInterfaceDescriptor;
        int iHashCode8 = getcausescount8 == null ? 0 : getcausescount8.hashCode();
        getCausesCount<Float> getcausescount9 = this.asBinder;
        int iHashCode9 = getcausescount9 == null ? 0 : getcausescount9.hashCode();
        getCausesCount<Float> getcausescount10 = this.IAuthTabCallback;
        int iHashCode10 = getcausescount10 == null ? 0 : getcausescount10.hashCode();
        getCausesCount<Float> getcausescount11 = this.IAuthTabCallbackDefault;
        int iHashCode11 = getcausescount11 == null ? 0 : getcausescount11.hashCode();
        getCausesCount<Float> getcausescount12 = this.asInterface;
        int iHashCode12 = getcausescount12 == null ? 0 : getcausescount12.hashCode();
        getCausesCount<Float> getcausescount13 = this.onWarmupCompleted;
        return (((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (getcausescount13 != null ? getcausescount13.hashCode() : 0);
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        getCausesCount<AnimUtils> getcausescount = this.IAuthTabCallbackStubProxy;
        getCausesCount<Pair<Float, Float>> getcausescount2 = this.onExtraCallback;
        getCausesCount<Double> getcausescount3 = this.onExtraCallbackWithResult;
        getCausesCount<Double> getcausescount4 = this.onNavigationEvent;
        getCausesCount<Float> getcausescount5 = this.onTransact;
        getCausesCount<Float> getcausescount6 = this.access100;
        getCausesCount<Float> getcausescount7 = this.IAuthTabCallbackStub;
        getCausesCount<Float> getcausescount8 = this.getInterfaceDescriptor;
        getCausesCount<Float> getcausescount9 = this.asBinder;
        getCausesCount<Float> getcausescount10 = this.IAuthTabCallback;
        getCausesCount<Float> getcausescount11 = this.IAuthTabCallbackDefault;
        getCausesCount<Float> getcausescount12 = this.asInterface;
        getCausesCount<Float> getcausescount13 = this.onWarmupCompleted;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new char[]{'\n', 19, 24, ' ', 22, 23, '\f', '#', 18, 21, 28, 5, 22, '#', 24, 22, 21, 24, 23, 2, 18, 29, 5, 19, 22, 24, 13851}, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 117), 27 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(getcausescount);
        Object[] objArr2 = new Object[1];
        a(new char[]{2, '\t', 24, 16, 24, 4, '#', 22, '\n', '\"', 13766}, (byte) (Drawable.resolveOpacity(0, 0) + 31), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getcausescount2);
        Object[] objArr3 = new Object[1];
        a(new char[]{2, '\t', '\b', 24, 16, 3, 13740}, (byte) (View.getDefaultSize(0, 0) + 5), 7 - ((Process.getThreadPriority(0) + 20) >> 6), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(getcausescount3);
        Object[] objArr4 = new Object[1];
        b(new char[]{6917, 33673, 55386, 8137, 41512, 8043, 6527, 61460, 47444, 56729, 52705, 41615, 50780, 11043}, ExpandableListView.getPackedPositionChild(0L) + 14, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(getcausescount4);
        Object[] objArr5 = new Object[1];
        a(new char[]{2, '\t', 22, '#', ' ', 28, '\f', 21, '#', 18, 19, ' '}, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25), 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(getcausescount5);
        Object[] objArr6 = new Object[1];
        a(new char[]{2, '\t', 17, 16, 20, 28, '#', '\f', 18, 6, '#', 22, '\n', '\"', 13845}, (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 110), 15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(getcausescount6);
        Object[] objArr7 = new Object[1];
        b(new char[]{6917, 33673, 48496, 39193, 9048, 36387, 50780, 11043}, Color.argb(0, 0, 0, 0) + 7, objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(getcausescount7);
        Object[] objArr8 = new Object[1];
        a(new char[]{2, '\t', 21, '\f', 22, '\b', 28, 20, 13805, 13805, 24, 22, 13739}, (byte) (4 - (Process.myPid() >> 22)), 13 - TextUtils.getTrimmedLength(""), objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(getcausescount8);
        Object[] objArr9 = new Object[1];
        b(new char[]{6917, 33673, 47444, 56729, 20121, 5966, 48296, 34204, 62779, 25021, 10873, 3443, 48447, 49638, 52705, 41615, 55625, 22266, 64576, 23512}, 20 - Color.alpha(0), objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(getcausescount9);
        Object[] objArr10 = new Object[1];
        b(new char[]{6917, 33673, 54378, 51913, 25468, 15561, 16946, 38106, 52705, 41615, 50780, 11043}, 11 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(getcausescount10);
        Object[] objArr11 = new Object[1];
        b(new char[]{6917, 33673, 14981, 43383, 976, 10252}, AndroidCharacter.getMirror('0') - '*', objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(getcausescount11);
        Object[] objArr12 = new Object[1];
        b(new char[]{6917, 33673, 22244, 3725, 59778, 62212, 25048, 44479, 50780, 11043}, View.MeasureSpec.getSize(0) + 9, objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(getcausescount12);
        Object[] objArr13 = new Object[1];
        a(new char[]{2, '\t', 28, 16, 29, '\n', 28, 20, 13861, 13861, 13795}, (byte) (59 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - TextUtils.getCapsMode("", 0, 0), objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(getcausescount13);
        Object[] objArr14 = new Object[1];
        b(new char[]{34023, 50763}, Color.rgb(0, 0, 0) + 16777217, objArr14);
        sb.append(((String) objArr14[0]).intern());
        String string = sb.toString();
        int i2 = extraCallback + 55;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public track(@Nullable getCausesCount<AnimUtils> getcausescount, @Nullable getCausesCount<Pair<Float, Float>> getcausescount2, @Nullable getCausesCount<Double> getcausescount3, @Nullable getCausesCount<Double> getcausescount4, @Nullable getCausesCount<Float> getcausescount5, @Nullable getCausesCount<Float> getcausescount6, @Nullable getCausesCount<Float> getcausescount7, @Nullable getCausesCount<Float> getcausescount8, @Nullable getCausesCount<Float> getcausescount9, @Nullable getCausesCount<Float> getcausescount10, @Nullable getCausesCount<Float> getcausescount11, @Nullable getCausesCount<Float> getcausescount12, @Nullable getCausesCount<Float> getcausescount13) {
        this.IAuthTabCallbackStubProxy = getcausescount;
        this.onExtraCallback = getcausescount2;
        this.onExtraCallbackWithResult = getcausescount3;
        this.onNavigationEvent = getcausescount4;
        this.onTransact = getcausescount5;
        this.access100 = getcausescount6;
        this.IAuthTabCallbackStub = getcausescount7;
        this.getInterfaceDescriptor = getcausescount8;
        this.asBinder = getcausescount9;
        this.IAuthTabCallback = getcausescount10;
        this.IAuthTabCallbackDefault = getcausescount11;
        this.asInterface = getcausescount12;
        this.onWarmupCompleted = getcausescount13;
    }

    public final getCausesCount<AnimUtils> asInterface() {
        getCausesCount<AnimUtils> getcausescount;
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 == 0) {
            getcausescount = this.IAuthTabCallbackStubProxy;
            int i4 = 75 / 0;
        } else {
            getcausescount = this.IAuthTabCallbackStubProxy;
        }
        int i5 = i3 + 109;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Pair<Float, Float>> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallback + 29;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getCausesCount<Pair<Float, Float>> getcausescount = this.onExtraCallback;
        int i4 = i3 + 31;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return getcausescount;
    }

    public final getCausesCount<Double> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 41;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onExtraCallbackWithResult;
        }
        throw null;
    }

    public final getCausesCount<Double> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 43;
        int i3 = i2 % 128;
        onActivityLayout = i3;
        int i4 = i2 % 2;
        getCausesCount<Double> getcausescount = this.onNavigationEvent;
        int i5 = i3 + 39;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Float> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 57;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        getCausesCount<Float> getcausescount = this.onTransact;
        int i5 = i3 + 69;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Float> asBinder() {
        int i = 2 % 2;
        int i2 = onActivityLayout;
        int i3 = i2 + 105;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Float> getcausescount = this.access100;
        int i5 = i2 + 39;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    public final getCausesCount<Float> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 17;
        onActivityLayout = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackStub;
        }
        throw null;
    }

    public final getCausesCount<Float> onTransact() {
        int i = 2 % 2;
        int i2 = onActivityLayout + 7;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getCausesCount<Float> getcausescount = this.getInterfaceDescriptor;
        int i4 = i3 + 101;
        onActivityLayout = i4 % 128;
        int i5 = i4 % 2;
        return getcausescount;
    }

    public final getCausesCount<Float> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 49;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        getCausesCount<Float> getcausescount = this.asBinder;
        int i5 = i2 + 3;
        onActivityLayout = i5 % 128;
        int i6 = i5 % 2;
        return getcausescount;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $11 + 75;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i8) ^ ((c2 << 4) + ((char) (writeTypedObject ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ICustomTabsCallback);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                        int iMyPid = (Process.myPid() >> 22) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), jumpTapTimeout, iMyPid, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (readTypedObject ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(extraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), 12434 - ExpandableListView.getPackedPositionType(0L), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 16014), 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 19901 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        Object obj;
        int i4 = 2;
        int i5 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = access000;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 121;
                $10 = i7 % 128;
                int i8 = i7 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Drawable.resolveOpacity(0, 0), 25 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i4 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback_Parcel)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 26 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0, 0) + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i9 = $11 + 115;
            int i10 = i9 % 128;
            $10 = i10;
            int i11 = i9 % 2;
            i3 = i - 1;
            cArr4[i3] = (char) (cArr[i3] - b);
            int i12 = i10 + 11;
            $11 = i12 % 128;
            i2 = 2;
            int i13 = i12 % 2;
        } else {
            i2 = 2;
            i3 = i;
        }
        if (i3 > 1) {
            int i14 = $11 + 89;
            $10 = i14 % 128;
            if (i14 % i2 != 0) {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 24824), 74 - (ViewConfiguration.getTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i15 = $10 + 21;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, 19489 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                        } else {
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i20];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i21];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            int i23 = $10 + 93;
            $11 = i23 % 128;
            int i24 = i23 % 2;
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
