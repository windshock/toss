package o;

import android.content.Context;
import android.content.res.ColorStateList;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import im.toss.tds.R;
import im.toss.tds.view.component.atom.text.BaseTextView;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class unstable_isModuleRegistered {
    public static final int $stable = 8;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    @SerializedName("color")
    private ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 color;

    @SerializedName("colorName")
    private String colorName;

    @SerializedName("colorResId")
    private Integer colorResId;

    @SerializedName("decorate")
    private ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 decorate;

    @SerializedName(getAdExperienceType.QUERY_KEY)
    private Float size;

    @SerializedName("text")
    private String text;

    @SerializedName("weight")
    private unstable_isLegacyModuleRegistered weight;

    public unstable_isModuleRegistered() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unstable_isModuleRegistered)) {
            return false;
        }
        unstable_isModuleRegistered unstable_ismoduleregistered = (unstable_isModuleRegistered) obj;
        if (this.weight != unstable_ismoduleregistered.weight || !Intrinsics.areEqual(this.text, unstable_ismoduleregistered.text) || !Intrinsics.areEqual(this.color, unstable_ismoduleregistered.color) || this.decorate != unstable_ismoduleregistered.decorate) {
            return false;
        }
        if (!Intrinsics.areEqual(this.colorResId, unstable_ismoduleregistered.colorResId)) {
            int i3 = IAuthTabCallback + 21;
            onExtraCallback = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.size, unstable_ismoduleregistered.size)) {
            int i4 = IAuthTabCallback + 37;
            onExtraCallback = i4 % 128;
            return i4 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.colorName, unstable_ismoduleregistered.colorName)) {
            return true;
        }
        int i5 = IAuthTabCallback + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = this.weight.hashCode();
        int iHashCode5 = this.text.hashCode();
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 = this.color;
        int iHashCode6 = 0;
        if (reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 == null) {
            int i2 = onExtraCallback + 9;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.hashCode();
        }
        int iHashCode7 = this.decorate.hashCode();
        Integer num = this.colorResId;
        if (num == null) {
            int i4 = IAuthTabCallback + 83;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 4;
            }
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        Float f = this.size;
        if (f == null) {
            int i6 = onExtraCallback + 13;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = f.hashCode();
        }
        String str = this.colorName;
        if (str != null) {
            iHashCode6 = str.hashCode();
            int i8 = IAuthTabCallback + 101;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return (((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode6;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StyledText(weight=" + this.weight + ", text=" + this.text + ", color=" + this.color + ", decorate=" + this.decorate + ", colorResId=" + this.colorResId + ", size=" + this.size + ", colorName=" + this.colorName + ")";
        int i2 = onExtraCallback + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public unstable_isModuleRegistered(@NotNull unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered, @NotNull String str, @Nullable ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1, @NotNull ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0, @Nullable Integer num, @Nullable Float f, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(unstable_islegacymoduleregistered, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0, "");
        this.weight = unstable_islegacymoduleregistered;
        this.text = str;
        this.color = reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1;
        this.decorate = reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0;
        this.colorResId = num;
        this.size = f;
        this.colorName = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ unstable_isModuleRegistered(unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered, String str, ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1, ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0, Integer num, Float f, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda12;
        Integer num2;
        if ((i & 1) != 0) {
            int i2 = IAuthTabCallback + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                unstable_islegacymoduleregistered = unstable_isLegacyModuleRegistered.REGULAR;
                int i3 = 39 / 0;
            } else {
                unstable_islegacymoduleregistered = unstable_isLegacyModuleRegistered.REGULAR;
            }
        }
        if ((i & 2) != 0) {
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        }
        String str3 = str;
        String str4 = null;
        if ((i & 4) != 0) {
            int i6 = onExtraCallback + 7;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            reactPackageTurboModuleManagerDelegateExternalSyntheticLambda12 = null;
        } else {
            reactPackageTurboModuleManagerDelegateExternalSyntheticLambda12 = reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1;
        }
        if ((i & 8) != 0) {
            reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 = ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.NORMAL;
            int i9 = IAuthTabCallback + 81;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
        }
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda02 = reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0;
        if ((i & 16) != 0) {
            int i12 = IAuthTabCallback + 47;
            onExtraCallback = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            num2 = null;
        } else {
            num2 = num;
        }
        Float f2 = (i & 32) != 0 ? null : f;
        if ((i & 64) != 0) {
            int i13 = 2 % 2;
        } else {
            str4 = str2;
        }
        this(unstable_islegacymoduleregistered, str3, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda12, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda02, num2, f2, str4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r1 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r1 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        return o.response.Regular;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        return o.response.Medium;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return o.response.Bold;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r1 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = o.unstable_isModuleRegistered.onExtraCallback + 117;
        o.unstable_isModuleRegistered.IAuthTabCallback = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.response onExtraCallbackWithResult() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.unstable_isModuleRegistered.onExtraCallback
            int r1 = r1 + 29
            int r2 = r1 % 128
            o.unstable_isModuleRegistered.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            o.unstable_isLegacyModuleRegistered r1 = r4.weight
            int[] r2 = o.unstable_isModuleRegistered.IAuthTabCallback.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == 0) goto L3e
            goto L28
        L1b:
            o.unstable_isLegacyModuleRegistered r1 = r4.weight
            int[] r2 = o.unstable_isModuleRegistered.IAuthTabCallback.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L3e
        L28:
            int r2 = o.unstable_isModuleRegistered.onExtraCallback
            int r2 = r2 + 117
            int r3 = r2 % 128
            o.unstable_isModuleRegistered.IAuthTabCallback = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L36
            if (r1 == r0) goto L3b
            goto L38
        L36:
            if (r1 == r0) goto L3b
        L38:
            o.response r0 = o.response.Regular
            return r0
        L3b:
            o.response r0 = o.response.Medium
            return r0
        L3e:
            o.response r0 = o.response.Bold
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.unstable_isModuleRegistered.onExtraCallbackWithResult():o.response");
    }

    private final int IAuthTabCallback(Context context, int i) {
        int i2 = 2 % 2;
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 = this.color;
        if (reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 != null) {
            return reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.onWarmupCompleted(context, i);
        }
        String str = this.colorName;
        if (str != null) {
            int i3 = onExtraCallback + 51;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return setBodyokhttp.onWarmupCompleted(context, str, i);
            }
            setBodyokhttp.onWarmupCompleted(context, str, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.colorResId;
        if (num != null) {
            int i4 = IAuthTabCallback + 25;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i = num.intValue();
        }
        int color = context.getColor(i);
        int i6 = IAuthTabCallback + 69;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return color;
    }

    public static /* synthetic */ void onWarmupCompleted(unstable_isModuleRegistered unstable_ismoduleregistered, BaseTextView baseTextView, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 51;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            num = null;
        }
        unstable_ismoduleregistered.onExtraCallback(baseTextView, num);
    }

    public final void onExtraCallback(@Nullable BaseTextView baseTextView, @Nullable Integer num) {
        int iIntValue;
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (baseTextView != null) {
            int i4 = 0;
            transparentBackground.onNavigationEvent(baseTextView, false);
            Pattern patternCompile = Pattern.compile("<?[a-z][\\s\\S]*>");
            Context context = baseTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (num != null) {
                int i5 = IAuthTabCallback + 73;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    num.intValue();
                    throw null;
                }
                iIntValue = num.intValue();
            } else {
                iIntValue = R.color.grey_800;
            }
            int iIAuthTabCallback = IAuthTabCallback(context, iIntValue);
            String strIAuthTabCallbackDefault = mergeParams.IAuthTabCallbackDefault(this.text);
            boolean zFind = patternCompile.matcher(strIAuthTabCallbackDefault).find();
            CharSequence charSequenceIAuthTabCallback = strIAuthTabCallbackDefault;
            if (zFind) {
                int i6 = onExtraCallback + 121;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                charSequenceIAuthTabCallback = mergeParams.IAuthTabCallback(strIAuthTabCallbackDefault, false, 1, (Object) null);
            }
            baseTextView.setText(charSequenceIAuthTabCallback);
            Float f = this.size;
            if (f != null) {
                int i8 = IAuthTabCallback + 27;
                onExtraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    baseTextView.setTextSize(0, f.floatValue());
                } else {
                    baseTextView.setTextSize(1, f.floatValue());
                }
            }
            baseTextView.onNavigationEvent(onExtraCallbackWithResult());
            baseTextView.setTextColor(iIAuthTabCallback);
            ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 = this.decorate;
            ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda02 = ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.TEXT_CTA;
            if (reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 == reactPackageTurboModuleManagerDelegateExternalSyntheticLambda02) {
                i = viva.republica.toss.R.drawable.icon_arrow_right_blue_400;
                int i9 = onExtraCallback + 33;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i = 0;
            }
            baseTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            if (this.decorate == reactPackageTurboModuleManagerDelegateExternalSyntheticLambda02) {
                baseTextView.setSupportCompoundDrawablesTintList(ColorStateList.valueOf(iIAuthTabCallback));
            }
            transparentBackground.onNavigationEvent(baseTextView, this.decorate == ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.LINE_THROUGH);
            CharSequence text = baseTextView.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (StringsKt.isBlank(text)) {
                i4 = 8;
            } else {
                int i11 = onExtraCallback + 17;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    i4 = 1;
                }
            }
            baseTextView.setVisibility(i4);
        }
    }

    public /* synthetic */ void IAuthTabCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        jsonWriter.beginObject();
        onExtraCallback(gson, jsonWriter, defaultGainProviderBuilderExternalSyntheticLambda1);
        jsonWriter.endObject();
    }

    protected /* synthetic */ void onExtraCallback(Gson gson, JsonWriter jsonWriter, DefaultGainProviderBuilderExternalSyntheticLambda1 defaultGainProviderBuilderExternalSyntheticLambda1) {
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 522);
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1 = this.color;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.class, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1).write(jsonWriter, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda1);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 53);
        jsonWriter.value(this.colorName);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 651);
        Integer num = this.colorResId;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Integer.class, num).write(jsonWriter, num);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 817);
        ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0 = this.decorate;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.class, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0).write(jsonWriter, reactPackageTurboModuleManagerDelegateExternalSyntheticLambda0);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 435);
        Float f = this.size;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, Float.class, f).write(jsonWriter, f);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 231);
        jsonWriter.value(this.text);
        defaultGainProviderBuilderExternalSyntheticLambda1.onWarmupCompleted(jsonWriter, 480);
        unstable_isLegacyModuleRegistered unstable_islegacymoduleregistered = this.weight;
        DefaultGainProviderBuilderExternalSyntheticLambda0.onNavigationEvent(gson, unstable_isLegacyModuleRegistered.class, unstable_islegacymoduleregistered).write(jsonWriter, unstable_islegacymoduleregistered);
    }

    public /* synthetic */ void onExtraCallbackWithResult(Gson gson, JsonReader jsonReader, DefaultGainProviderExternalSyntheticLambda3 defaultGainProviderExternalSyntheticLambda3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IAuthTabCallback(gson, jsonReader, defaultGainProviderExternalSyntheticLambda3.onNavigationEvent(jsonReader));
        }
        jsonReader.endObject();
    }

    protected /* synthetic */ void IAuthTabCallback(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i == 71) {
            if (!z) {
                this.text = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.text = jsonReader.nextString();
                return;
            } else {
                this.text = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 233) {
            if (z) {
                this.colorResId = (Integer) gson.getAdapter(Integer.class).read(jsonReader);
                return;
            } else {
                this.colorResId = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 296) {
            if (z) {
                this.decorate = (ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0) gson.getAdapter(ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda0.class).read(jsonReader);
                return;
            } else {
                this.decorate = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 336) {
            if (z) {
                this.weight = (unstable_isLegacyModuleRegistered) gson.getAdapter(unstable_isLegacyModuleRegistered.class).read(jsonReader);
                return;
            } else {
                this.weight = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i == 384) {
            if (!z) {
                this.colorName = null;
                jsonReader.nextNull();
                return;
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.colorName = jsonReader.nextString();
                return;
            } else {
                this.colorName = Boolean.toString(jsonReader.nextBoolean());
                return;
            }
        }
        if (i == 519) {
            if (z) {
                this.size = (Float) gson.getAdapter(Float.class).read(jsonReader);
                return;
            } else {
                this.size = null;
                jsonReader.nextNull();
                return;
            }
        }
        if (i != 563) {
            jsonReader.skipValue();
        } else if (z) {
            this.color = (ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1) gson.getAdapter(ReactPackageTurboModuleManagerDelegateExternalSyntheticLambda1.class).read(jsonReader);
        } else {
            this.color = null;
            jsonReader.nextNull();
        }
    }
}
