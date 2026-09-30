package im.toss.tds.view.component.compound.listheader;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.R;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.ICrashFilter;
import o.IOOMCallback;
import o.ProtocolCompanion;
import o.WebSocketFactory;
import o.access15300;
import o.enableThreadsBoost;
import o.getDid;
import o.getTagsokhttp;
import o.getUrlokhttp;
import o.initMiniApp;
import o.initSDK;
import o.onInstallReferrerSetupFinished;
import o.registerCrashCallback;
import o.reportCustomErr;
import o.response;
import o.setBodyokhttp;
import o.setCustomDataCallback;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TdsListHeaderV2View extends ConstraintLayout implements registerCrashCallback {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final Lazy onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        public static final /* synthetic */ int[] onNavigationEvent;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallback.values().length];
            try {
                iArr[onExtraCallback.ROW1A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onExtraCallback.ROW1B.ordinal()] = 2;
                int i = IAuthTabCallbackStub + 1;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onExtraCallback.ROW2A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[onExtraCallback.ROW2B.ordinal()] = 4;
                int i3 = IAuthTabCallbackStub + 11;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            onExtraCallbackWithResult = iArr;
            int[] iArr2 = new int[onWarmupCompleted.values().length];
            try {
                iArr2[onWarmupCompleted.ROW1A.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[onWarmupCompleted.ROW1B.ordinal()] = 2;
                int i6 = IAuthTabCallback + 103;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            onExtraCallback = iArr2;
            int[] iArr3 = new int[ProtocolCompanion.values().length];
            try {
                iArr3[ProtocolCompanion.LEFT24.ordinal()] = 1;
                int i8 = IAuthTabCallbackStub + 1;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ProtocolCompanion.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            onNavigationEvent = iArr3;
            int[] iArr4 = new int[getTagsokhttp.values().length];
            try {
                iArr4[getTagsokhttp.TYPE1.ordinal()] = 1;
                int i10 = IAuthTabCallback + 19;
                IAuthTabCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                int i12 = 2 % 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[getTagsokhttp.TYPE2.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[getTagsokhttp.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            onWarmupCompleted = iArr4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TdsListHeaderV2View(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i11 = ~i;
        int i12 = (~(i11 | i8 | i2)) | (~(i7 | i11 | i3));
        int i13 = i2 + i3 + i5 + ((-195996979) * i6) + ((-904719387) * i4);
        int i14 = i13 * i13;
        int i15 = (i2 * 1886715248) + 940376064 + (1886715248 * i3) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i5) + ((-1389494272) * i6) + (1623064576 * i4) + (1510801408 * i14);
        int i16 = (i2 * 1590984816) + 1398186415 + (i3 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i5 * 1590985553) + (i6 * (-1025631779)) + (i4 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        return i17 != 1 ? i17 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        TdsListHeaderV2View tdsListHeaderV2View = (TdsListHeaderV2View) objArr[0];
        View.OnClickListener onClickListener = (View.OnClickListener) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), 991551913, -991551911, new Object[]{tdsListHeaderV2View, onClickListener, view}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
            int i3 = 2 / 0;
        } else {
            onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), 991551913, -991551911, new Object[]{tdsListHeaderV2View, onClickListener, view}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
        }
        int i4 = onExtraCallback + 19;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsListHeaderV2View(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = reportCustomErr.onNavigationEvent(this, IOOMCallback.ListHeader, false, (Function0) null, (Function1) null, 14, (Object) null);
        if (getId() == -1) {
            setId(R.id.tds_list_header_v2);
            int i2 = 2 % 2;
        }
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
        }
        LayoutInflater.from(context).inflate(R.layout.tds_list_header_v2, (ViewGroup) this, true);
        this.onNavigationEvent = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TdsListHeaderV2, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == R.styleable.TdsListHeaderV2_android_paddingVertical) {
                    setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_24)));
                    setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_8)));
                } else {
                    Object obj = null;
                    if (index == R.styleable.TdsListHeaderV2_android_paddingTop) {
                        int i4 = onExtraCallback + 73;
                        IAuthTabCallback = i4 % 128;
                        if (i4 % 2 != 0) {
                            setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_24)));
                            throw null;
                        }
                        setPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_24)));
                    } else if (index == R.styleable.TdsListHeaderV2_android_paddingBottom) {
                        setPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, getResources().getDimensionPixelOffset(R.dimen.list_row_padding_vertical_8)));
                    } else if (index == R.styleable.TdsListHeaderV2_headerType) {
                        setHeaderType((onExtraCallback) onExtraCallback.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                        int i5 = IAuthTabCallback + 31;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                    } else if (index == R.styleable.TdsListHeaderV2_valueType) {
                        int i7 = IAuthTabCallback + 15;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        setValueType((onWarmupCompleted) onWarmupCompleted.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                        int i9 = onExtraCallback + 65;
                        IAuthTabCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                        }
                    } else if (index == R.styleable.TdsListHeaderV2_title) {
                        setTitle(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.TdsListHeaderV2_titleColor) {
                        int i10 = IAuthTabCallback + 61;
                        onExtraCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            setTitleColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                            obj.hashCode();
                            throw null;
                        }
                        setTitleColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.TdsListHeaderV2_titleArrow) {
                        setTitleArrow(typedArrayObtainStyledAttributes.getBoolean(index, false));
                    } else if (index == R.styleable.TdsListHeaderV2_subtitle) {
                        int i11 = IAuthTabCallback + 19;
                        onExtraCallback = i11 % 128;
                        int i12 = i11 % 2;
                        setSubtitle(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.TdsListHeaderV2_subtitleColor) {
                        setSubtitleColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.TdsListHeaderV2_subtitleArrow) {
                        setSubtitleArrow(typedArrayObtainStyledAttributes.getBoolean(index, false));
                    } else if (index == R.styleable.TdsListHeaderV2_value) {
                        setValue(typedArrayObtainStyledAttributes.getString(index));
                    } else if (index == R.styleable.TdsListHeaderV2_valueColor) {
                        setValueColor(typedArrayObtainStyledAttributes.getColorStateList(index));
                    } else if (index == R.styleable.TdsListHeaderV2_valueArrow) {
                        int i13 = onExtraCallback + 57;
                        IAuthTabCallback = i13 % 128;
                        if (i13 % 2 != 0) {
                            setValueArrow$default(this, typedArrayObtainStyledAttributes.getBoolean(index, true), 0, 2, null);
                        } else {
                            setValueArrow$default(this, typedArrayObtainStyledAttributes.getBoolean(index, false), 0, 2, null);
                        }
                    } else if (index == R.styleable.TdsListHeaderV2_border) {
                        setBorder(typedArrayObtainStyledAttributes.getBoolean(index, false));
                    } else if (index == R.styleable.TdsListHeaderV2_borderType) {
                        int i14 = onExtraCallback + 5;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            setBorderType((ProtocolCompanion) ProtocolCompanion.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                        } else {
                            setBorderType((ProtocolCompanion) ProtocolCompanion.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                        }
                    } else if (index == R.styleable.TdsListHeaderV2_disabledType) {
                        setDisabledType((getTagsokhttp) getTagsokhttp.getEntries().get(typedArrayObtainStyledAttributes.getInt(index, 0)));
                    }
                    int i15 = 2 % 2;
                }
            }
        }
        super/*android.view.View*/.setPadding(0, 0, 0, 0);
        super/*android.view.View*/.setPaddingRelative(0, 0, 0, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsListHeaderV2View(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onExtraCallback + 29;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 57 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 45;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public /* bridge */ String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = super/*o.MonitorCrashConfig*/.IAuthTabCallback();
        int i4 = IAuthTabCallback + 107;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return strIAuthTabCallback;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            writeTypedObject();
            throw null;
        }
        setCustomDataCallback setcustomdatacallbackWriteTypedObject = writeTypedObject();
        int i3 = IAuthTabCallback + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return setcustomdatacallbackWriteTypedObject;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ Set<String> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Set<String> setIAuthTabCallbackStub = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStub();
        int i4 = onExtraCallback + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return setIAuthTabCallbackStub;
    }

    public /* bridge */ initSDK IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
            obj.hashCode();
            throw null;
        }
        initSDK initsdkIAuthTabCallbackStubProxy = super/*o.MonitorCrashConfig*/.IAuthTabCallbackStubProxy();
        int i3 = onExtraCallback + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return initsdkIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public /* bridge */ boolean IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        }
        super/*o.setDeviceId*/.IAuthTabCallback_Parcel();
        throw null;
    }

    public /* bridge */ enableThreadsBoost.onNavigationEvent access000() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        enableThreadsBoost.onNavigationEvent onnavigationeventAccess000 = super/*o.setDeviceId*/.access000();
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationeventAccess000;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean access100() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess100 = super/*o.initSDK*/.access100();
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zAccess100;
        }
        throw null;
    }

    public /* bridge */ Function1<ICrashFilter, Boolean> asBinder() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<ICrashFilter, Boolean> function1AsBinder = super/*o.MonitorCrashConfig*/.asBinder();
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return function1AsBinder;
    }

    public /* bridge */ boolean extraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zExtraCallback = super/*o.MonitorCrashConfig*/.extraCallback();
        int i4 = onExtraCallback + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zExtraCallback;
    }

    public /* bridge */ initSDK.onNavigationEvent getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
            obj.hashCode();
            throw null;
        }
        initSDK.onNavigationEvent interfaceDescriptor = super/*o.MonitorCrashConfig*/.getInterfaceDescriptor();
        int i3 = onExtraCallback + 59;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return interfaceDescriptor;
        }
        throw null;
    }

    public /* bridge */ initSDK.onNavigationEvent onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        initSDK.onNavigationEvent onnavigationeventOnExtraCallback = super/*o.MonitorCrashConfig*/.onExtraCallback();
        int i4 = IAuthTabCallback + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationeventOnExtraCallback;
    }

    public /* bridge */ initMiniApp onExtraCallbackWithResult() {
        initMiniApp initminiappOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
            int i3 = 39 / 0;
        } else {
            initminiappOnExtraCallbackWithResult = super/*o.MonitorCrashConfig*/.onExtraCallbackWithResult();
        }
        int i4 = IAuthTabCallback + 17;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return initminiappOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ enableThreadsBoost onNavigationEvent() {
        enableThreadsBoost enablethreadsboostOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
            int i3 = 48 / 0;
        } else {
            enablethreadsboostOnNavigationEvent = super/*o.MonitorCrashConfig*/.onNavigationEvent();
        }
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return enablethreadsboostOnNavigationEvent;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.setDeviceId*/.onNavigationEvent(map);
        }
        super/*o.setDeviceId*/.onNavigationEvent(map);
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent(@NotNull ICrashFilter iCrashFilter) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.setDeviceId*/.onNavigationEvent(iCrashFilter);
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        int i5 = onExtraCallback + 59;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ getDid onTransact() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getDid getdidOnTransact = super/*o.MonitorCrashConfig*/.onTransact();
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return getdidOnTransact;
        }
        throw null;
    }

    public /* bridge */ Map<String, Object> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapOnWarmupCompleted = super/*o.MonitorCrashConfig*/.onWarmupCompleted();
        int i4 = IAuthTabCallback + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return mapOnWarmupCompleted;
        }
        throw null;
    }

    public /* bridge */ void setAsCtaButton() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.initSDK*/.setAsCtaButton();
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setComponentKey(@Nullable enableThreadsBoost enablethreadsboost) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setComponentKey(enablethreadsboost);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 69;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParam(@NotNull String str, @NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParam(str, function1);
        int i4 = onExtraCallback + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setCustomParams(@NotNull Function1<? super initSDK.onNavigationEvent, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setCustomParams(function1);
        int i4 = onExtraCallback + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setEventLoggableChecker(@Nullable Function1<? super ICrashFilter, Boolean> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setEventLoggableChecker(function1);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void setMaskingWords(@NotNull Set<String> set) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMaskingWords(set);
        int i4 = IAuthTabCallback + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    public /* bridge */ void setMetadata(@NotNull getDid getdid) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setMetadata(getdid);
        int i4 = IAuthTabCallback + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ void setTrackable(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*o.MonitorCrashConfig*/.setTrackable(z);
        int i4 = IAuthTabCallback + 21;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public setCustomDataCallback writeTypedObject() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onExtraCallbackWithResult.getValue();
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return setcustomdatacallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onExtraCallback ROW1A = new onExtraCallback("ROW1A", 0);
        public static final onExtraCallback ROW1B = new onExtraCallback("ROW1B", 1);
        public static final onExtraCallback ROW2A = new onExtraCallback("ROW2A", 2);
        public static final onExtraCallback ROW2B = new onExtraCallback("ROW2B", 3);
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        private static final /* synthetic */ onExtraCallback[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 119;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback[] onextracallbackArr = {ROW1A, ROW1B, ROW2A, ROW2B};
            int i5 = i2 + 9;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 35;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i5 = i2 + 67;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallback;
            }
            throw null;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = (onExtraCallback[]) $VALUES.clone();
            int i4 = onExtraCallbackWithResult + 81;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        private onExtraCallback(String str, int i) {
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = IAuthTabCallback + 33;
            onExtraCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 75 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        public static final onWarmupCompleted ROW1A = new onWarmupCompleted("ROW1A", 0);
        public static final onWarmupCompleted ROW1B = new onWarmupCompleted("ROW1B", 1);
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        private static int onNavigationEvent;

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 87;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = ROW1A;
                onWarmupCompleted onwarmupcompleted2 = ROW1B;
                onwarmupcompletedArr = new onWarmupCompleted[3];
                onwarmupcompletedArr[1] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{ROW1A, ROW1B};
            }
            int i4 = i2 + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = onNavigationEvent + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 1;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallback + 7;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback;
        int i7 = i6 + 9;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        if (this.onNavigationEvent) {
            ((View) onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), 86888726, -86888726, new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback())).getLayoutParams().width = i;
            onPostMessage().getLayoutParams().height = i2;
            onMessageChannelReady().getLayoutParams().width = i3;
            onActivityLayout().getLayoutParams().height = i4;
            return;
        }
        int i9 = i6 + 17;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 121;
        int i7 = i6 % 128;
        onExtraCallback = i7;
        Object obj = null;
        if (i6 % 2 != 0) {
            if (this.onNavigationEvent) {
                ((View) onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), 86888726, -86888726, new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback())).getLayoutParams().width = getLeft();
                onPostMessage().getLayoutParams().height = i2;
                onMessageChannelReady().getLayoutParams().width = getRight();
                onActivityLayout().getLayoutParams().height = i4;
                return;
            }
            int i8 = i7 + 95;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setPaddingTop(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        View viewOnPostMessage = onPostMessage();
        ViewGroup.LayoutParams layoutParams = onPostMessage().getLayoutParams();
        layoutParams.height = i;
        viewOnPostMessage.setLayoutParams(layoutParams);
        int i5 = IAuthTabCallback + 41;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPaddingBottom(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            View viewOnActivityLayout = onActivityLayout();
            ViewGroup.LayoutParams layoutParams = onActivityLayout().getLayoutParams();
            layoutParams.height = i;
            viewOnActivityLayout.setLayoutParams(layoutParams);
            int i4 = 29 / 0;
        } else {
            View viewOnActivityLayout2 = onActivityLayout();
            ViewGroup.LayoutParams layoutParams2 = onActivityLayout().getLayoutParams();
            layoutParams2.height = i;
            viewOnActivityLayout2.setLayoutParams(layoutParams2);
        }
        int i5 = onExtraCallback + 17;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnClickListener(@Nullable final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        if (onClickListener == null) {
            int i2 = IAuthTabCallback + 3;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super/*android.view.View*/.setOnClickListener(onClickListener);
            return;
        }
        super/*android.view.View*/.setOnClickListener(new View.OnClickListener() { // from class: im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = {this.f$0, onClickListener, view};
                TdsListHeaderV2View.onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), -467232, 467233, objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
                int i7 = onWarmupCompleted + 55;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 97 / 0;
                }
            }
        });
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        TdsListHeaderV2View tdsListHeaderV2View = (TdsListHeaderV2View) objArr[0];
        View.OnClickListener onClickListener = (View.OnClickListener) objArr[1];
        View view = (View) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, tdsListHeaderV2View, (initMiniApp) null, 2, (Object) null);
        onClickListener.onClick(view);
        int i4 = onExtraCallback + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setHeaderType(@NotNull onExtraCallback onextracallback) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        int i2 = onExtraCallbackWithResult.onExtraCallbackWithResult[onextracallback.ordinal()];
        if (i2 == 1) {
            onRelationshipValidationResult().setVisibility(0);
            onRelationshipValidationResult().IAuthTabCallback(4);
            if (!isInEditMode()) {
                onRelationshipValidationResult().onNavigationEvent(response.Bold);
            }
            AppCompatTextView appCompatTextViewOnRelationshipValidationResult = onRelationshipValidationResult();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            appCompatTextViewOnRelationshipValidationResult.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onUnminimized());
            onMinimized().setVisibility(8);
            return;
        }
        int i3 = onExtraCallback + 25;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 == 0 ? i2 == 2 : i2 == 2) {
            onRelationshipValidationResult().setVisibility(0);
            onRelationshipValidationResult().IAuthTabCallback(5);
            if (!isInEditMode()) {
                int i5 = onExtraCallback + 99;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    onRelationshipValidationResult().onNavigationEvent(response.Bold);
                    throw null;
                }
                onRelationshipValidationResult().onNavigationEvent(response.Bold);
            }
            AppCompatTextView appCompatTextViewOnRelationshipValidationResult2 = onRelationshipValidationResult();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration2 = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            appCompatTextViewOnRelationshipValidationResult2.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration2)).onRelationshipValidationResult());
            onMinimized().setVisibility(8);
            return;
        }
        if (i2 == 3) {
            onRelationshipValidationResult().setVisibility(0);
            onRelationshipValidationResult().IAuthTabCallback(7);
            if (!isInEditMode()) {
                int i6 = onExtraCallback + 101;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                onRelationshipValidationResult().onNavigationEvent(response.Regular);
            }
            AppCompatTextView appCompatTextViewOnRelationshipValidationResult3 = onRelationshipValidationResult();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration3 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            appCompatTextViewOnRelationshipValidationResult3.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration3)).ICustomTabsCallbackStubProxy());
            onMinimized().setVisibility(0);
            onMinimized().IAuthTabCallback(3);
            if (!isInEditMode()) {
                onMinimized().onNavigationEvent(response.Bold);
            }
            AppCompatTextView appCompatTextViewOnMinimized = onMinimized();
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Configuration configuration4 = context4.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration4, "");
            appCompatTextViewOnMinimized.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration4)).onUnminimized());
            int i8 = onExtraCallback + 53;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return;
        }
        int i10 = i4 + 23;
        onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        if (i2 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        onRelationshipValidationResult().setVisibility(0);
        onRelationshipValidationResult().IAuthTabCallback(5);
        if (!isInEditMode()) {
            int i12 = IAuthTabCallback + 31;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            onRelationshipValidationResult().onNavigationEvent(response.Regular);
        }
        AppCompatTextView appCompatTextViewOnRelationshipValidationResult4 = onRelationshipValidationResult();
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        Configuration configuration5 = context5.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration5, "");
        appCompatTextViewOnRelationshipValidationResult4.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration5)).ICustomTabsCallbackStubProxy());
        onMinimized().setVisibility(0);
        onMinimized().IAuthTabCallback(2);
        if (!isInEditMode()) {
            onMinimized().onNavigationEvent(response.Bold);
        }
        AppCompatTextView appCompatTextViewOnMinimized2 = onMinimized();
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "");
        Configuration configuration6 = context6.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration6, "");
        appCompatTextViewOnMinimized2.setTextColor(new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration6)).onUnminimized());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.onExtraCallback + 9;
        im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.IAuthTabCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if ((r5 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        ICustomTabsCallbackStub().IAuthTabCallback(98);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        ICustomTabsCallbackStub().IAuthTabCallback(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        ICustomTabsCallbackStub().IAuthTabCallback(7);
        r5 = im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.onExtraCallback + 45;
        im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.IAuthTabCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if ((r5 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r5 = 66 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r5 != 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setValueType(@NotNull onWarmupCompleted onwarmupcompleted) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            i = onExtraCallbackWithResult.onExtraCallback[onwarmupcompleted.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            i = onExtraCallbackWithResult.onExtraCallback[onwarmupcompleted.ordinal()];
        }
    }

    public final void setTitle(@Nullable String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onRelationshipValidationResult().setText(str);
        int i4 = onExtraCallback + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
            if (colorStateList != null) {
                onRelationshipValidationResult().setTextColor(colorStateList);
            }
        } else if (colorStateList != null) {
        }
        int i4 = IAuthTabCallback + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setTitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onRelationshipValidationResult().setTextColor(i);
        int i5 = IAuthTabCallback + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setTitleArrow(boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(this, onRelationshipValidationResult(), z, 1, 2, null);
        } else {
            onWarmupCompleted(this, onRelationshipValidationResult(), z, 0, 4, null);
        }
        int i3 = IAuthTabCallback + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSubtitle(@Nullable String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onMinimized().setText(str);
        int i4 = IAuthTabCallback + 27;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
    }

    public final void setSubtitleColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (colorStateList != null) {
            onMinimized().setTextColor(colorStateList);
            int i3 = IAuthTabCallback + 39;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public final void setSubtitleColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 47;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        onMinimized().setTextColor(i);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSubtitleArrow(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(this, onMinimized(), z, 0, 3, null);
        } else {
            onWarmupCompleted(this, onMinimized(), z, 0, 4, null);
        }
        int i3 = onExtraCallback + 93;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 26 / 0;
        }
    }

    public final void setValue(@Nullable String str) {
        int i;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ICustomTabsCallbackStub().setText(str);
        AppCompatTextView appCompatTextViewICustomTabsCallbackStub = ICustomTabsCallbackStub();
        if ((str == null || str.length() == 0) && ICustomTabsCallbackStub().getCompoundDrawables()[2] == null) {
            int i5 = IAuthTabCallback + 21;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            i = 8;
        } else {
            i = 0;
        }
        appCompatTextViewICustomTabsCallbackStub.setVisibility(i);
    }

    public final void setValueColor(@Nullable ColorStateList colorStateList) {
        int i = 2 % 2;
        if (colorStateList != null) {
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            ICustomTabsCallbackStub().setTextColor(colorStateList);
            int i4 = onExtraCallback + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setValueColor(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 9;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        ICustomTabsCallbackStub().setTextColor(i);
        int i5 = onExtraCallback + 75;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void setValueArrow$default(TdsListHeaderV2View tdsListHeaderV2View, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 107;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = tdsListHeaderV2View.ICustomTabsCallbackDefault();
        }
        tdsListHeaderV2View.setValueArrow(z, i);
        int i6 = IAuthTabCallback + 105;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setValueArrow(boolean z, int i) {
        int iOnNavigationEvent;
        int i2 = 2 % 2;
        onNavigationEvent(ICustomTabsCallbackStub(), z, i);
        AppCompatTextView appCompatTextViewICustomTabsCallbackStub = ICustomTabsCallbackStub();
        int i3 = 0;
        if (z) {
            int i4 = onExtraCallback + 69;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            iOnNavigationEvent = 0;
        } else {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(8.0f), displayMetrics);
            int i6 = IAuthTabCallback + 57;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        appCompatTextViewICustomTabsCallbackStub.setPadding(0, 0, iOnNavigationEvent, 0);
        AppCompatTextView appCompatTextViewICustomTabsCallbackStub2 = ICustomTabsCallbackStub();
        CharSequence text = ICustomTabsCallbackStub().getText();
        if ((text == null || text.length() == 0) && !z) {
            int i8 = onExtraCallback + 91;
            int i9 = i8 % 128;
            IAuthTabCallback = i9;
            int i10 = i8 % 2 != 0 ? 18 : 8;
            int i11 = i9 + 89;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            i3 = i10;
        }
        appCompatTextViewICustomTabsCallbackStub2.setVisibility(i3);
        int i13 = IAuthTabCallback + 35;
        onExtraCallback = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnActivityResized = new getUrlokhttp(new setBodyokhttp.onWarmupCompleted(configuration)).onActivityResized();
        int i2 = IAuthTabCallback + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return iOnActivityResized;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        asInterface().setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((!r4) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r4 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        asInterface().setVisibility(0);
        r4 = im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.IAuthTabCallback + 55;
        im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.onExtraCallback = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBorder(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 60 / 0;
        }
    }

    public static /* synthetic */ void setImage$default(TdsListHeaderV2View tdsListHeaderV2View, String str, float f, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i3 + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            f = 16.0f;
        }
        tdsListHeaderV2View.setImage(str, f);
    }

    public final void setImage(@NotNull String str, float f) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (ICustomTabsCallback() == null) {
            int i4 = IAuthTabCallback + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallbackWithResult(f);
        }
        TdsImageView tdsImageViewICustomTabsCallback = ICustomTabsCallback();
        if (tdsImageViewICustomTabsCallback != null) {
            TdsImageView.setImage$default(tdsImageViewICustomTabsCallback, str, (Function1) null, (Function1) null, 6, (Object) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r5 = im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.IAuthTabCallback + 35;
        im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.onExtraCallback = r5 % 128;
        r5 = r5 % 2;
        r5 = asInterface().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5, "");
        r0 = getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        ((android.view.ViewGroup.MarginLayoutParams) r5).leftMargin = o.varyMatches.onNavigationEvent(java.lang.Float.valueOf(0.0f), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        r5 = asInterface().getLayoutParams();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5, "");
        r1 = getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        ((android.view.ViewGroup.MarginLayoutParams) r5).leftMargin = o.varyMatches.onNavigationEvent(java.lang.Float.valueOf(24.0f), r1);
        r5 = im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.onExtraCallback + 49;
        im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.IAuthTabCallback = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        r5 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if (r5 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r5 != 2) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setBorderType(@NotNull ProtocolCompanion protocolCompanion) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 49;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(protocolCompanion, "");
            i = onExtraCallbackWithResult.onNavigationEvent[protocolCompanion.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(protocolCompanion, "");
            i = onExtraCallbackWithResult.onNavigationEvent[protocolCompanion.ordinal()];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void setDisabledType(@NotNull getTagsokhttp gettagsokhttp) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(gettagsokhttp, "");
        int i4 = onExtraCallbackWithResult.onWarmupCompleted[gettagsokhttp.ordinal()];
        if (i4 == 1) {
            readTypedObject().setBackgroundResource(R.drawable.tds_list_row_v1_disabled_type1_bg);
            int i5 = IAuthTabCallback + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (i4 == 2) {
            readTypedObject().setBackgroundResource(R.drawable.tds_list_row_v1_disabled_type2_bg);
            return;
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = IAuthTabCallback + 73;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            readTypedObject().setBackgroundColor(1);
        } else {
            readTypedObject().setBackgroundColor(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void onWarmupCompleted(TdsListHeaderV2View tdsListHeaderV2View, BaseTextView baseTextView, boolean z, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 93;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                i = baseTextView.getCurrentTextColor();
                int i5 = 62 / 0;
            } else {
                i = baseTextView.getCurrentTextColor();
            }
            int i6 = onExtraCallback + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        tdsListHeaderV2View.onNavigationEvent(baseTextView, z, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r1 = getContext().getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r1 = o.varyMatches.onNavigationEvent(java.lang.Float.valueOf(24.0f), r1);
        r8.setColorFilter(new android.graphics.PorterDuffColorFilter(r9, android.graphics.PorterDuff.Mode.SRC_IN));
        r8.setBounds(0, 0, r1, r1);
        r7.setCompoundDrawables((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r8, (android.graphics.drawable.Drawable) null);
        r7 = im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.onExtraCallback + 71;
        im.toss.tds.view.component.compound.listheader.TdsListHeaderV2View.IAuthTabCallback = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        r7.setCompoundDrawables((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r8 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r8 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r8 = androidx.core.content.res.ResourcesCompat.onExtraCallback(getResources(), im.toss.tds.R.drawable.icon_arrow_right_mono, (android.content.res.Resources.Theme) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(BaseTextView baseTextView, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, android.widget.ImageView, im.toss.tds.view.component.atom.image.TdsImageView] */
    private final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        ?? tdsImageView = new TdsImageView(getContext(), null, 0, 6, null);
        int i2 = R.id.tds_list_header_v2_left_image;
        tdsImageView.setId(i2);
        tdsImageView.setAdjustViewBounds(true);
        Float fValueOf = Float.valueOf(24.0f);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
        DisplayMetrics displayMetrics2 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        addView(tdsImageView, 0, new ConstraintLayout.onExtraCallbackWithResult(iOnNavigationEvent, varyMatches.onNavigationEvent(fValueOf, displayMetrics2)));
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk();
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onNavigationEvent(this);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 1, R.id.spaceLeft, 2);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 3, R.id.spaceTop, 4);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(i2, 4, R.id.spaceBottom, 3);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onWarmupCompleted(R.id.dividerLeft, 1, i2, 2);
        deactivateEncoderSurfaceBeforeStopEncoderQuirk.onExtraCallbackWithResult(this);
        ViewGroup.LayoutParams layoutParams = extraCallbackWithResult().getLayoutParams();
        DisplayMetrics displayMetrics3 = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        layoutParams.width = varyMatches.onNavigationEvent(Float.valueOf(f), displayMetrics3);
        if (!isInEditMode()) {
            return;
        }
        int i3 = IAuthTabCallback + 109;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        tdsImageView.setImageResource(R.drawable.auto_awesome);
        int i5 = onExtraCallback + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        registerCrashCallback registercrashcallback = (TdsListHeaderV2View) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(registercrashcallback.findViewById(R.id.spaceLeft));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        View viewFindViewById = registercrashcallback.findViewById(R.id.spaceLeft);
        Intrinsics.checkNotNull(viewFindViewById);
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onPostMessage() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.spaceTop);
        if (i3 == 0) {
            Intrinsics.checkNotNull(viewFindViewById);
            int i4 = 85 / 0;
        } else {
            Intrinsics.checkNotNull(viewFindViewById);
        }
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.spaceRight);
        Intrinsics.checkNotNull(viewFindViewById);
        if (i3 == 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View onActivityLayout() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.spaceBottom);
        Intrinsics.checkNotNull(viewFindViewById);
        if (i3 == 0) {
            return viewFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Typography onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objFindViewById = findViewById(R.id.title);
        Intrinsics.checkNotNull(objFindViewById);
        Typography typography = (Typography) objFindViewById;
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return typography;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Typography onMinimized() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objFindViewById = findViewById(R.id.subtitle);
        Intrinsics.checkNotNull(objFindViewById);
        Typography typography = (Typography) objFindViewById;
        int i4 = onExtraCallback + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return typography;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Typography ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objFindViewById = findViewById(R.id.value);
        Intrinsics.checkNotNull(objFindViewById);
        Typography typography = (Typography) objFindViewById;
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return typography;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View asInterface() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.border);
        Intrinsics.checkNotNull(viewFindViewById);
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.overlay);
        Intrinsics.checkNotNull(viewFindViewById);
        int i4 = IAuthTabCallback + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return viewFindViewById;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TdsImageView ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objFindViewById = findViewById(R.id.tds_list_header_v2_left_image);
        if (i3 != 0) {
            return (TdsImageView) objFindViewById;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Space extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        View viewFindViewById = findViewById(R.id.dividerLeft);
        if (i3 != 0) {
            return (Space) viewFindViewById;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(TdsListHeaderV2View tdsListHeaderV2View, View.OnClickListener onClickListener, View view) {
        onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), 991551913, -991551911, new Object[]{tdsListHeaderV2View, onClickListener, view}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    public final View onActivityResized() {
        return (View) onExtraCallback(WebSocketFactory.onExtraCallback.IAuthTabCallback(), 86888726, -86888726, new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }
}
