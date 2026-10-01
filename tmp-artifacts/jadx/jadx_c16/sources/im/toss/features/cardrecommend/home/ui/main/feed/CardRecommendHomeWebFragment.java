package im.toss.features.cardrecommend.home.ui.main.feed;

import android.content.Context;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.features.cardrecommend.home.ui.main.feed.CardRecommendHomeWebFragment$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.SessionTrackerb;
import o.SetDetectableSize;
import o.convertAnyToMap;
import o.onRenderReady;
import o.startH5OpenAuth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CardRecommendHomeWebFragment extends Hilt_CardRecommendHomeWebFragment implements startH5OpenAuth {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private int IAuthTabCallback;
    private static char[] onNavigationEvent = {32267, 32265, 32278, 32281, 32276, 32266, 32279, 32460, 32471, 32283, 32485, 32282, 32465, 32273, 32272, 32285, 32264, 32280};
    private static int onExtraCallback = -1184334202;
    private static boolean onWarmupCompleted = true;
    private static boolean onExtraCallbackWithResult = true;

    public static /* synthetic */ boolean onExtraCallbackWithResult(CardRecommendHomeWebFragment cardRecommendHomeWebFragment, MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(cardRecommendHomeWebFragment, menuItem);
        int i4 = asInterface + 81;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return zOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CardRecommendHomeWebFragment cardRecommendHomeWebFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(cardRecommendHomeWebFragment, setDetectableSize);
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return unitOnNavigationEvent;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        int i4 = asBinder + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater menuInflater) {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        Intrinsics.checkNotNullParameter(menuInflater, "");
        menuInflater.inflate(R.menu.menu_text_item, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.item_text);
        if (menuItemFindItem != null) {
            int i4 = asBinder + 95;
            asInterface = i4 % 128;
            menuItemFindItem.setVisible(i4 % 2 != 0);
        }
    }

    public void onPrepareOptionsMenu(@NotNull Menu menu) {
        int i = 2 % 2;
        int i2 = asInterface + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(menu, "");
        super/*androidx.fragment.app.Fragment*/.onPrepareOptionsMenu(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.item_text);
        if (menuItemFindItem != null) {
            menuItemFindItem.setTitle(getString(R.string.guide));
            menuItemFindItem.setVisible(true);
            menuItemFindItem.setOnMenuItemClickListener(new CardRecommendHomeWebFragment$.ExternalSyntheticLambda1(this));
            int i4 = asInterface + 111;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final Unit onNavigationEvent(CardRecommendHomeWebFragment cardRecommendHomeWebFragment, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-123, -124, -123, -123, -124, -110, -124, -123}, 126 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Bundle bundleRequireArguments = cardRecommendHomeWebFragment.requireArguments();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-123, -124, -123, -123, -124, -110, -124, -123}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr2);
        setDetectableSize.onExtraCallback(strIntern, bundleRequireArguments.getString(((String) objArr2[0]).intern()));
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 109;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unit;
    }

    private static final boolean onExtraCallback(CardRecommendHomeWebFragment cardRecommendHomeWebFragment, MenuItem menuItem) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(menuItem, "");
        ConvertByteArrayToFloatArray.onExtraCallback(1299079L, false, (String) null, (Map) null, new CardRecommendHomeWebFragment$.ExternalSyntheticLambda0(cardRecommendHomeWebFragment), 14, (Object) null);
        SessionTrackerb sessionTrackerbOnRelationshipValidationResult = cardRecommendHomeWebFragment.onRelationshipValidationResult();
        Context contextRequireContext = cardRecommendHomeWebFragment.requireContext();
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -110, -113, -112, -119, -122, -113, -124, -111, -124, -119, -113, -121, -112, -122, -117, -116, -113, -124, -114, -114, -121, -118, -124, -123, -115, -116, -123, -117, -118, -119, -119, -120, -127, -127, -121, -122, -123, -124, -125, -126, -127}, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, objArr);
        SessionTrackerb.onExtraCallbackWithResult(sessionTrackerbOnRelationshipValidationResult, contextRequireContext, convertAnyToMap.IAuthTabCallback(convertAnyToMap.IAuthTabCallback(((String) objArr[0]).intern(), "previousScreen", "card_brokerage__home"), "eventType", "recent"), false, (Function1) null, (Bundle) null, false, 60, (Object) null);
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return true;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.lab_frame_layout);
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), this.IAuthTabCallback, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        }
        int i4 = asBinder + 37;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void onExtraCallbackWithResult(int i) {
        View view;
        View viewFindViewById;
        int i2 = 2 % 2;
        int i3 = asBinder + 105;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback = i;
            if (!onRenderReady.IAuthTabCallback(this) || (view = getView()) == null || (viewFindViewById = view.findViewById(R.id.lab_frame_layout)) == null) {
                return;
            }
            int i4 = asBinder + 23;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), i, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
                return;
            } else {
                viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), i, viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
                throw null;
            }
        }
        this.IAuthTabCallback = i;
        onRenderReady.IAuthTabCallback(this);
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 123;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 77 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 20952 - ExpandableListView.getPackedPositionType(j), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i3 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 77 - ExpandableListView.getPackedPositionType(0L), TextUtils.getOffsetBefore("", 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i3] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i3++;
                }
                j = 0;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 75 - View.MeasureSpec.makeMeasureSpec(0, 0), ImageFormat.getBitsPerPixel(0) + 16038, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onWarmupCompleted) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i5 = $10 + 9;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i6 = $11 + 35;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.getMode(0) + 63, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12213, 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }
}
