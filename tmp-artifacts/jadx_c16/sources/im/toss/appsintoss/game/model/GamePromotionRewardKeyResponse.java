package im.toss.appsintoss.game.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.appsintoss.game.model.GamePromotionRewardKeyResponse$;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.htf31;
import o.liq;
import o.okycx;
import o.vyl;
import org.jetbrains.annotations.Nullable;

@liq
/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GamePromotionRewardKeyResponse {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int $stable = 0;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted;
    private final String key;

    static {
        onWarmupCompleted();
        Companion = new Companion((DefaultConstructorMarker) null);
        int i = onNavigationEvent + 105;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof im.toss.appsintoss.game.model.GamePromotionRewardKeyResponse) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 7;
        im.toss.appsintoss.game.model.GamePromotionRewardKeyResponse.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.key, ((im.toss.appsintoss.game.model.GamePromotionRewardKeyResponse) r6).key)) == true) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
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
        int i2 = onExtraCallback;
        int i3 = i2 + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.key.hashCode();
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.key;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(new int[]{0, 35, 0, 19}, false, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0}, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a(new int[]{35, 1, 70, 0}, true, new byte[]{1}, objArr2);
        sb.append(((String) objArr2[0]).intern());
        String string = sb.toString();
        int i2 = onExtraCallback + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public /* synthetic */ GamePromotionRewardKeyResponse(int i, String str, okycx okycxVar) {
        if (1 != (i & 1)) {
            int i2 = IAuthTabCallback + 29;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            htf31.onExtraCallbackWithResult(i, 1, GamePromotionRewardKeyResponse$.serializer.INSTANCE.getDescriptor());
            int i4 = IAuthTabCallback + 85;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        this.key = str;
    }

    @JvmStatic
    public static final /* synthetic */ void onNavigationEvent(GamePromotionRewardKeyResponse gamePromotionRewardKeyResponse, vyl vylVar, SerialDescriptor serialDescriptor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        vylVar.onExtraCallback(serialDescriptor, i2 % 2 != 0 ? 1 : 0, gamePromotionRewardKeyResponse.key);
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        int i4 = i2 % 2;
        String str = this.key;
        int i5 = i3 + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = onWarmupCompleted;
        if (cArr2 != null) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - ((byte) KeyEvent.getModifierMetaStateMask())), 35 - TextUtils.getTrimmedLength(""), Process.getGidForName("") + 14240, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 89;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - Color.blue(0)), 65 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 16718 - TextUtils.indexOf("", "", 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - TextUtils.indexOf((CharSequence) "", '0'), 17656 - ImageFormat.getBitsPerPixel(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.red(0) + 70, 12487 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i13 = $10 + 5;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{27262, 27175, 27173, 27161, 27158, 27169, 27179, 27157, 27170, 27199, 27169, 27168, 27198, 27170, 27144, 27143, 27174, 27169, 27157, 27148, 27162, 27177, 27175, 27156, 27183, 27198, 27168, 27168, 27199, 27168, 27170, 27168, 27182, 27157, 27168, 27257};
    }
}
