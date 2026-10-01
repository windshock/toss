package im.toss.features.credit.ui.plus.intro.component;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.credit.ui.plus.R;
import im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2$;
import im.toss.tds.view.compat.component.TdsComposeView;
import im.toss.tds.view.compat.component.compound.listheader.TdsListHeaderV3View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ArchiveMatcher3;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;
import o.getAdService;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.initSDK;
import o.readIntokhttp;
import o.updateFileSpaceCache;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CreditPlusIntroComponentSection2 extends FrameLayout implements updateFileSpaceCache {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {27261, 27172, 27169, 27137, 27143, 27171, 27198, 27177, 27145, 27142, 27173, 27175, 27180, 27142, 27139, 27168, 27175, 27176, 27138, 27165, 27160, 27263, 27141, 27172, 27169, 27137, 27167, 27198, 27168, 27175, 27176, 27138, 27136, 27173, 27141, 27166, 27197, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27225, 27166, 27197, 27199, 27199, 27167, 27142, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27177, 27172, 27169, 27137, 27140, 27178, 27183, 27145, 27165, 27169, 27175, 27168, 27168, 27139, 27142, 27173, 27175, 27180, 27142, 27139, 27168, 27175, 27176, 27138, 27165, 27160, 27263, 27141, 27172, 27169, 27137, 27167, 27198, 27168, 27175, 27176, 27138, 27136, 27173, 27263, 27176, 27168, 27172, 27172, 27197, 27167, 27233, 27258, 27160, 27199, 27196, 27194, 27168, 27177, 27172, 27169, 27137, 27164, 27197, 27171, 27170, 27174, 27169, 27165, 27140, 27178, 27183, 27145, 27165, 27169, 27175, 27168, 27168, 27139, 27139, 27168, 27175, 27176, 27138, 27165, 27160, 27263, 27141, 27172, 27169, 27137, 27167, 27198, 27168, 27175, 27176, 27138, 27136, 27173, 27141, 27166, 27197, 27199, 27199, 27167};
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final ArchiveMatcher3 onExtraCallback;

    /* JADX WARN: Illegal instructions before constructor call */
    public CreditPlusIntroComponentSection2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public static /* synthetic */ Unit onExtraCallback(int i, initSDK.onNavigationEvent onnavigationevent) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, onnavigationevent);
        int i5 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditPlusIntroComponentSection2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        ArchiveMatcher3 archiveMatcher3OnExtraCallbackWithResult = ArchiveMatcher3.onExtraCallbackWithResult(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(archiveMatcher3OnExtraCallbackWithResult, "");
        this.onExtraCallback = archiveMatcher3OnExtraCallbackWithResult;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreditPlusIntroComponentSection2(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = onWarmupCompleted;
            int i3 = i2 + 39;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    @Override // o.updateFileSpaceCache
    public /* bridge */ void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(int i, initSDK.onNavigationEvent onnavigationevent) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.onExtraCallbackWithResult("order", Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final class IAuthTabCallback implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i4 = onNavigationEvent + 105;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback)) != true) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r4.IAuthTabCallback) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = o.getSpecialFeatureOptInStatus.Dark;
            r2 = im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2.IAuthTabCallbackDefault.onWarmupCompleted + 103;
            im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2.IAuthTabCallbackDefault.onExtraCallbackWithResult = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 49 / 0;
            }
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onNavigationEvent + 89;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return getspecialfeatureoptinstatus;
                }
                throw null;
            }
            readIntokhttp.onExtraCallback(this.onWarmupCompleted);
            throw null;
        }
    }

    public static final class asBinder implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onExtraCallbackWithResult + 71;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                return getspecialfeatureoptinstatus;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public asInterface(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onExtraCallback + 47;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallback implements getAdService {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onExtraCallback(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i4 = onWarmupCompleted + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            int i6 = onWarmupCompleted + 117;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 84 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 125;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                int i3 = onWarmupCompleted + 77;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                    throw null;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
                int i4 = onWarmupCompleted + 113;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 67 / 0;
                }
                return getspecialfeatureoptinstatus2;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            throw null;
        }
    }

    public static final class onNavigationEvent implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onWarmupCompleted;

        public onNavigationEvent(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        
            if (r1 == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onWarmupCompleted) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            r1 = im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2.onNavigationEvent.onExtraCallback + 21;
            im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2.onNavigationEvent.onNavigationEvent = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
        }
    }

    public static final class onTransact implements getAdService {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onTransact(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!(!readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult))) {
                int i2 = onWarmupCompleted + 41;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = IAuthTabCallback + 31;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onWarmupCompleted(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        
            return o.getSpecialFeatureOptInStatus.Light;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            r1 = im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2.onWarmupCompleted.onExtraCallbackWithResult + 17;
            im.toss.features.credit.ui.plus.intro.component.CreditPlusIntroComponentSection2.onWarmupCompleted.onExtraCallback = r1 % 128;
            r1 = r1 % 2;
            r0 = o.getSpecialFeatureOptInStatus.Dark;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
        
            if (r1 != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        
            if (o.readIntokhttp.onExtraCallback(r3.onNavigationEvent) != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        
            if ((!o.readIntokhttp.onExtraCallback(r3.onNavigationEvent)) != false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 115;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 57 / 0;
            }
        }
    }

    @Override // o.updateFileSpaceCache
    public void onNavigationEvent(int i, int i2, @NotNull Function0<Unit> function0) throws Throwable {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        boolean z = i2 <= 990;
        TdsListHeaderV3View tdsListHeaderV3View = this.onExtraCallback.asBinder;
        String string = tdsListHeaderV3View.getContext().getString(z ? R.string.credit_ui_plus_intro_section2_top_title_1 : R.string.credit_ui_plus_intro_section2_top_title_2);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsListHeaderV3View.setTitleText(string);
        tdsListHeaderV3View.setSize(TdsListHeaderV3View.onExtraCallbackWithResult.LARGE);
        Intrinsics.checkNotNull(tdsListHeaderV3View);
        Context context = tdsListHeaderV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListHeaderV3View.setTitleTextColor(new getUrlokhttp(new onWarmupCompleted(configuration)).onRelationshipValidationResult());
        tdsListHeaderV3View.setTitleWidthRatioValue(0.99f);
        TdsComposeView.onExtraCallbackWithResult(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{tdsListHeaderV3View, new CreditPlusIntroComponentSection2$.ExternalSyntheticLambda0(i)}, -122849947, JsParamKeys.onExtraCallbackWithResult(), 122849948);
        TdsListRowV1View tdsListRowV1View = this.onExtraCallback.onExtraCallback;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        String string2 = getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_center_1);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        if (z) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(new getUrlokhttp(new onNavigationEvent(configuration2)).onRelationshipValidationResult());
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_under_score_center_2_1));
            spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) " ");
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(new getUrlokhttp(new onExtraCallbackWithResult(configuration3)).asBinder());
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_under_score_center_2_2));
            spannableStringBuilder.setSpan(foregroundColorSpan2, length3, spannableStringBuilder.length(), 17);
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallback(configuration4)).onRelationshipValidationResult());
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_1_center_2_1));
            spannableStringBuilder.setSpan(foregroundColorSpan3, length4, spannableStringBuilder.length(), 17);
            int i4 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
        }
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        Object[] objArr = new Object[1];
        a(new int[]{0, 54, 0, 0}, true, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0}, objArr);
        onWarmupCompleted(tdsListRowV1View, ((String) objArr[0]).intern(), string2, spannedString);
        TdsListRowV1View tdsListRowV1View2 = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View2, "");
        String string3 = getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_2_center_1);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        StyleSpan styleSpan2 = new StyleSpan(1);
        int length5 = spannableStringBuilder2.length();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration5 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(new getUrlokhttp(new onExtraCallback(configuration5)).onRelationshipValidationResult());
        int length6 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_2_center_2_1));
        spannableStringBuilder2.setSpan(foregroundColorSpan4, length6, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.append((CharSequence) " ");
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration6 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration6, "");
        ForegroundColorSpan foregroundColorSpan5 = new ForegroundColorSpan(new getUrlokhttp(new asBinder(configuration6)).ICustomTabsServiceStubProxy());
        int length7 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_2_center_2_2));
        spannableStringBuilder2.setSpan(foregroundColorSpan5, length7, spannableStringBuilder2.length(), 17);
        spannableStringBuilder2.setSpan(styleSpan2, length5, spannableStringBuilder2.length(), 17);
        SpannedString spannedString2 = new SpannedString(spannableStringBuilder2);
        Object[] objArr2 = new Object[1];
        a(new int[]{54, 59, 0, 20}, true, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0}, objArr2);
        onWarmupCompleted(tdsListRowV1View2, ((String) objArr2[0]).intern(), string3, spannedString2);
        TdsListRowV1View tdsListRowV1View3 = this.onExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsListRowV1View3, "");
        String string4 = getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_center_1);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        StyleSpan styleSpan3 = new StyleSpan(1);
        int length8 = spannableStringBuilder3.length();
        if (z) {
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            Configuration configuration7 = context7.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration7, "");
            ForegroundColorSpan foregroundColorSpan6 = new ForegroundColorSpan(new getUrlokhttp(new asInterface(configuration7)).onRelationshipValidationResult());
            int length9 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_under_score_center_2_1));
            spannableStringBuilder3.setSpan(foregroundColorSpan6, length9, spannableStringBuilder3.length(), 17);
            spannableStringBuilder3.append((CharSequence) " ");
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            Configuration configuration8 = context8.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration8, "");
            ForegroundColorSpan foregroundColorSpan7 = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallbackDefault(configuration8)).asBinder());
            int length10 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_under_score_center_2_2));
            spannableStringBuilder3.setSpan(foregroundColorSpan7, length10, spannableStringBuilder3.length(), 17);
        } else {
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            Configuration configuration9 = context9.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration9, "");
            ForegroundColorSpan foregroundColorSpan8 = new ForegroundColorSpan(new getUrlokhttp(new IAuthTabCallbackStub(configuration9)).onRelationshipValidationResult());
            int length11 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_center_2_1));
            spannableStringBuilder3.setSpan(foregroundColorSpan8, length11, spannableStringBuilder3.length(), 17);
            spannableStringBuilder3.append((CharSequence) " ");
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "");
            Configuration configuration10 = context10.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration10, "");
            ForegroundColorSpan foregroundColorSpan9 = new ForegroundColorSpan(new getUrlokhttp(new onTransact(configuration10)).asBinder());
            int length12 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((CharSequence) getContext().getString(R.string.credit_ui_plus_intro_section2_list_row_3_center_2_2));
            spannableStringBuilder3.setSpan(foregroundColorSpan9, length12, spannableStringBuilder3.length(), 17);
        }
        spannableStringBuilder3.setSpan(styleSpan3, length8, spannableStringBuilder3.length(), 17);
        SpannedString spannedString3 = new SpannedString(spannableStringBuilder3);
        Object[] objArr3 = new Object[1];
        a(new int[]{113, 61, 0, 14}, true, new byte[]{1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0}, objArr3);
        onWarmupCompleted(tdsListRowV1View3, ((String) objArr3[0]).intern(), string4, spannedString3);
        int i6 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void onWarmupCompleted(TdsListRowV1View tdsListRowV1View, String str, String str2, CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListRowV1View.setLeftImage(str);
            tdsListRowV1View.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View, 102), varyMatches.IAuthTabCallback(tdsListRowV1View, 102));
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2D);
            tdsListRowV1View.setCenterText1(str2);
            tdsListRowV1View.setCenterText2(charSequence);
            tdsListRowV1View.setRightArrow(true);
        } else {
            tdsListRowV1View.setLeftImage(str);
            tdsListRowV1View.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View, 24), varyMatches.IAuthTabCallback(tdsListRowV1View, 24));
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2D);
            tdsListRowV1View.setCenterText1(str2);
            tdsListRowV1View.setCenterText2(charSequence);
            tdsListRowV1View.setRightArrow(false);
        }
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 25 / 0;
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = IAuthTabCallback;
        long j = -1;
        if (cArr2 != null) {
            int i8 = $10 + 5;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i10]);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)) + 35283), 35 - (Process.myPid() >> 22), 14240 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i10++;
                    i3 = 0;
                    j = -1;
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
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 61;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i5];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i12 = $10 + 49;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i14 = $10 + 25;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 10935), ExpandableListView.getPackedPositionChild(0L) + 66, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16717, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10935), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 65, 16718 - View.MeasureSpec.getMode(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i17 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, TextUtils.indexOf("", "") + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i17] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49467), (ViewConfiguration.getTouchSlop() >> 8) + 70, 12485 - ((byte) KeyEvent.getModifierMetaStateMask()), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i18 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i18, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i18);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i5) {
                    break;
                }
                int i19 = $11 + 65;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    int i21 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[i20] = cArr4[0];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent / 0;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i22 = $10 + 51;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr4);
    }
}
