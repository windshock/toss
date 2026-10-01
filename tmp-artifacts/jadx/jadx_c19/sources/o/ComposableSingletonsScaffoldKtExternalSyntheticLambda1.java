package o;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.google.common.base.Joiner;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ComposableSingletonsScaffoldKtExternalSyntheticLambda1 {
    private static final Joiner onNavigationEvent = Joiner.on(",");
    private final onExtraCallback IAuthTabCallback;
    private final int IAuthTabCallbackStub;
    private final onExtraCallbackWithResult onExtraCallback;
    private final onNavigationEvent onExtraCallbackWithResult;
    private final onWarmupCompleted onWarmupCompleted;

    public static final class IAuthTabCallback {
        private static final Pattern onExtraCallbackWithResult = Pattern.compile(".*-.*");
        private String IAuthTabCallbackDefault;
        private String IAuthTabCallbackStub;
        private final String access000;
        private ColorsKtExternalSyntheticLambda0 access100;
        private String asBinder;
        private Boolean asInterface;
        private boolean onExtraCallback;
        private final ComposableSingletonsScaffoldKtExternalSyntheticLambda0 onNavigationEvent;
        private boolean onTransact;
        private long onWarmupCompleted = -9223372036854775807L;
        private float IAuthTabCallback_Parcel = -3.4028235E38f;
        private long IAuthTabCallback = -9223372036854775807L;

        public IAuthTabCallback(ComposableSingletonsScaffoldKtExternalSyntheticLambda0 composableSingletonsScaffoldKtExternalSyntheticLambda0, String str) {
            this.onNavigationEvent = composableSingletonsScaffoldKtExternalSyntheticLambda0;
            this.access000 = str;
        }

        public IAuthTabCallback IAuthTabCallback(long j) {
            RecordingInputConnection_androidKt.onNavigationEvent(j >= 0);
            this.IAuthTabCallback = j;
            return this;
        }

        public IAuthTabCallback onExtraCallback(@Nullable String str) {
            this.asBinder = str;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(@Nullable String str) {
            this.IAuthTabCallbackDefault = str;
            return this;
        }

        public IAuthTabCallback onExtraCallbackWithResult(@Nullable String str) {
            this.IAuthTabCallbackStub = str;
            return this;
        }

        public IAuthTabCallback IAuthTabCallback(ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0) {
            this.access100 = colorsKtExternalSyntheticLambda0;
            return this;
        }

        public IAuthTabCallback onWarmupCompleted(long j) {
            RecordingInputConnection_androidKt.onNavigationEvent(j >= 0);
            this.onWarmupCompleted = j;
            return this;
        }

        public IAuthTabCallback onWarmupCompleted(float f) {
            RecordingInputConnection_androidKt.onNavigationEvent(f == -3.4028235E38f || f > 0.0f);
            this.IAuthTabCallback_Parcel = f;
            return this;
        }

        public IAuthTabCallback onExtraCallback(boolean z) {
            this.asInterface = Boolean.valueOf(z);
            return this;
        }

        public IAuthTabCallback onNavigationEvent(boolean z) {
            this.onExtraCallback = z;
            return this;
        }

        public IAuthTabCallback onWarmupCompleted(boolean z) {
            this.onTransact = z;
            return this;
        }

        public ComposableSingletonsScaffoldKtExternalSyntheticLambda1 onWarmupCompleted() {
            int iOnWarmupCompleted;
            int iOnExtraCallbackWithResult;
            int iOnWarmupCompleted2;
            boolean zOnNavigationEvent = onNavigationEvent(this.asBinder);
            if (!zOnNavigationEvent) {
                RecordingInputConnection_androidKt.onWarmupCompleted(this.access100, "Track selection must be set");
            }
            if (this.asBinder == null) {
                this.asBinder = onExtraCallback(((ColorsKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100)).IAuthTabCallback());
            }
            boolean zOnWarmupCompleted = onWarmupCompleted(this.asBinder);
            boolean z = true;
            if (zOnWarmupCompleted) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted != -9223372036854775807L, "Buffered duration must be set");
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback != -9223372036854775807L, "Chunk duration must be set");
            }
            ImmutableListMultimap<String, String> immutableListMultimapOnNavigationEvent = this.onNavigationEvent.IAuthTabCallback.onNavigationEvent();
            UnmodifiableIterator it = immutableListMultimapOnNavigationEvent.keySet().iterator();
            while (it.hasNext()) {
                IAuthTabCallback((List<String>) immutableListMultimapOnNavigationEvent.get((String) it.next()));
            }
            if (zOnNavigationEvent) {
                iOnWarmupCompleted = -2147483647;
                iOnExtraCallbackWithResult = -2147483647;
                iOnWarmupCompleted2 = -2147483647;
            } else {
                ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = (ColorsKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access100);
                int iMax = colorsKtExternalSyntheticLambda0.IAuthTabCallback().onExtraCallback;
                iOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(iMax, 1000);
                CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback = colorsKtExternalSyntheticLambda0.onExtraCallback();
                for (int i2 = 0; i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback.onWarmupCompleted; i2++) {
                    iMax = Math.max(iMax, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnExtraCallback.IAuthTabCallback(i2).onExtraCallback);
                }
                iOnWarmupCompleted2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(iMax, 1000);
                jOnExtraCallback = colorsKtExternalSyntheticLambda0.IAuthTabCallbackStub() != -2147483647L ? TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(colorsKtExternalSyntheticLambda0.IAuthTabCallbackStub(), 1000L) : -2147483647L;
                iOnExtraCallbackWithResult = this.onNavigationEvent.IAuthTabCallback.onExtraCallbackWithResult(iOnWarmupCompleted);
            }
            onExtraCallback.C0040onExtraCallback c0040onExtraCallback = new onExtraCallback.C0040onExtraCallback();
            if (this.onNavigationEvent.onExtraCallback()) {
                c0040onExtraCallback.onNavigationEvent(iOnWarmupCompleted);
            }
            if (this.onNavigationEvent.extraCallback()) {
                c0040onExtraCallback.onExtraCallbackWithResult(iOnWarmupCompleted2);
            }
            if (zOnWarmupCompleted && this.onNavigationEvent.onTransact()) {
                c0040onExtraCallback.onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.IAuthTabCallback));
            }
            if (this.onNavigationEvent.access000()) {
                c0040onExtraCallback.IAuthTabCallback(this.asBinder);
            }
            if (immutableListMultimapOnNavigationEvent.containsKey("CMCD-Object")) {
                c0040onExtraCallback.onExtraCallback((List<String>) immutableListMultimapOnNavigationEvent.get("CMCD-Object"));
            }
            onNavigationEvent.onExtraCallbackWithResult onextracallbackwithresult = new onNavigationEvent.onExtraCallbackWithResult();
            if (zOnWarmupCompleted) {
                if (this.onNavigationEvent.onExtraCallbackWithResult()) {
                    onextracallbackwithresult.onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.onWarmupCompleted));
                }
                if (this.onNavigationEvent.onWarmupCompleted()) {
                    onextracallbackwithresult.onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((long) (this.onWarmupCompleted / this.IAuthTabCallback_Parcel)));
                }
            }
            if (this.onNavigationEvent.IAuthTabCallbackDefault()) {
                onextracallbackwithresult.onNavigationEvent(jOnExtraCallback);
            }
            if (this.onNavigationEvent.IAuthTabCallbackStubProxy()) {
                if (!this.onExtraCallback && !this.onTransact) {
                    z = false;
                }
                onextracallbackwithresult.onWarmupCompleted(z);
            }
            if (this.onNavigationEvent.asInterface()) {
                onextracallbackwithresult.IAuthTabCallback(this.IAuthTabCallbackDefault);
            }
            if (this.onNavigationEvent.IAuthTabCallbackStub()) {
                onextracallbackwithresult.onExtraCallbackWithResult(this.IAuthTabCallbackStub);
            }
            if (immutableListMultimapOnNavigationEvent.containsKey("CMCD-Request")) {
                onextracallbackwithresult.onNavigationEvent((List<String>) immutableListMultimapOnNavigationEvent.get("CMCD-Request"));
            }
            onExtraCallbackWithResult.onNavigationEvent onnavigationevent = new onExtraCallbackWithResult.onNavigationEvent();
            if (this.onNavigationEvent.onNavigationEvent()) {
                onnavigationevent.onNavigationEvent(this.onNavigationEvent.onNavigationEvent);
            }
            if (this.onNavigationEvent.access100()) {
                onnavigationevent.onExtraCallback(this.onNavigationEvent.onExtraCallback);
            }
            if (this.onNavigationEvent.extraCallbackWithResult()) {
                onnavigationevent.onExtraCallbackWithResult(this.access000);
            }
            if (this.asInterface != null && this.onNavigationEvent.getInterfaceDescriptor()) {
                onnavigationevent.IAuthTabCallback(((Boolean) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asInterface)).booleanValue() ? "l" : "v");
            }
            if (this.onNavigationEvent.IAuthTabCallback_Parcel()) {
                onnavigationevent.onWarmupCompleted(this.IAuthTabCallback_Parcel);
            }
            if (immutableListMultimapOnNavigationEvent.containsKey("CMCD-Session")) {
                onnavigationevent.onWarmupCompleted((List<String>) immutableListMultimapOnNavigationEvent.get("CMCD-Session"));
            }
            onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult2 = new onWarmupCompleted.onExtraCallbackWithResult();
            if (this.onNavigationEvent.asBinder()) {
                onextracallbackwithresult2.IAuthTabCallback(iOnExtraCallbackWithResult);
            }
            if (this.onNavigationEvent.IAuthTabCallback()) {
                onextracallbackwithresult2.onWarmupCompleted(this.onExtraCallback);
            }
            if (immutableListMultimapOnNavigationEvent.containsKey("CMCD-Status")) {
                onextracallbackwithresult2.onWarmupCompleted((List<String>) immutableListMultimapOnNavigationEvent.get("CMCD-Status"));
            }
            return new ComposableSingletonsScaffoldKtExternalSyntheticLambda1(c0040onExtraCallback.IAuthTabCallback(), onextracallbackwithresult.onExtraCallback(), onnavigationevent.onNavigationEvent(), onextracallbackwithresult2.onExtraCallback(), this.onNavigationEvent.onExtraCallbackWithResult);
        }

        private static String onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            Object[] objArr = {basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub};
            String str = (String) AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -798870803, 798870805, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr);
            String strIAuthTabCallbackDefault = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.IAuthTabCallbackDefault(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub);
            if (str != null && strIAuthTabCallbackDefault != null) {
                return "av";
            }
            int iOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable);
            if (iOnExtraCallback == -1) {
                iOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.asInterface);
            }
            if (iOnExtraCallback == 1) {
                return "a";
            }
            if (iOnExtraCallback == 2) {
                return "v";
            }
            return null;
        }

        private static boolean onNavigationEvent(@Nullable String str) {
            return Objects.equals(str, "m");
        }

        private static boolean onWarmupCompleted(@Nullable String str) {
            return Objects.equals(str, "a") || Objects.equals(str, "v") || Objects.equals(str, "av");
        }

        private void IAuthTabCallback(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(onExtraCallbackWithResult.matcher(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(it.next(), "=")[0]).matches());
            }
        }
    }

    private ComposableSingletonsScaffoldKtExternalSyntheticLambda1(onExtraCallback onextracallback, onNavigationEvent onnavigationevent, onExtraCallbackWithResult onextracallbackwithresult, onWarmupCompleted onwarmupcompleted, int i2) {
        this.IAuthTabCallback = onextracallback;
        this.onExtraCallbackWithResult = onnavigationevent;
        this.onExtraCallback = onextracallbackwithresult;
        this.onWarmupCompleted = onwarmupcompleted;
        this.IAuthTabCallbackStub = i2;
    }

    public TextFieldSelectionStateExternalSyntheticLambda12 IAuthTabCallback(TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12) {
        ArrayListMultimap<String, String> arrayListMultimapCreate = ArrayListMultimap.create();
        this.IAuthTabCallback.onExtraCallbackWithResult(arrayListMultimapCreate);
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(arrayListMultimapCreate);
        this.onExtraCallback.onExtraCallback(arrayListMultimapCreate);
        this.onWarmupCompleted.onNavigationEvent(arrayListMultimapCreate);
        if (this.IAuthTabCallbackStub == 0) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (String str : arrayListMultimapCreate.keySet()) {
                List list = arrayListMultimapCreate.get(str);
                Collections.sort(list);
                builder.put(str, onNavigationEvent.join(list));
            }
            return textFieldSelectionStateExternalSyntheticLambda12.onNavigationEvent(builder.buildOrThrow());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListMultimapCreate.asMap().values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
        Collections.sort(arrayList);
        return textFieldSelectionStateExternalSyntheticLambda12.onExtraCallbackWithResult().IAuthTabCallback(textFieldSelectionStateExternalSyntheticLambda12.asInterface.buildUpon().appendQueryParameter("CMCD", onNavigationEvent.join(arrayList)).build()).onExtraCallbackWithResult();
    }

    static final class onExtraCallback {
        public final long IAuthTabCallback;
        public final ImmutableList<String> onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final String onNavigationEvent;
        public final int onWarmupCompleted;

        /* renamed from: o.ComposableSingletonsScaffoldKtExternalSyntheticLambda1$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0040onExtraCallback {
            private String onNavigationEvent;
            private int onWarmupCompleted = -2147483647;
            private int onExtraCallback = -2147483647;
            private long onExtraCallbackWithResult = -9223372036854775807L;
            private ImmutableList<String> IAuthTabCallback = ImmutableList.of();

            public C0040onExtraCallback onNavigationEvent(int i2) {
                RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 || i2 == -2147483647);
                this.onWarmupCompleted = i2;
                return this;
            }

            public C0040onExtraCallback onExtraCallbackWithResult(int i2) {
                RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 || i2 == -2147483647);
                this.onExtraCallback = i2;
                return this;
            }

            public C0040onExtraCallback onNavigationEvent(long j) {
                RecordingInputConnection_androidKt.onNavigationEvent(j >= 0 || j == -9223372036854775807L);
                this.onExtraCallbackWithResult = j;
                return this;
            }

            public C0040onExtraCallback IAuthTabCallback(@Nullable String str) {
                this.onNavigationEvent = str;
                return this;
            }

            public C0040onExtraCallback onExtraCallback(List<String> list) {
                this.IAuthTabCallback = ImmutableList.copyOf(list);
                return this;
            }

            public onExtraCallback IAuthTabCallback() {
                return new onExtraCallback(this);
            }
        }

        private onExtraCallback(C0040onExtraCallback c0040onExtraCallback) {
            this.onWarmupCompleted = c0040onExtraCallback.onWarmupCompleted;
            this.onExtraCallbackWithResult = c0040onExtraCallback.onExtraCallback;
            this.IAuthTabCallback = c0040onExtraCallback.onExtraCallbackWithResult;
            this.onNavigationEvent = c0040onExtraCallback.onNavigationEvent;
            this.onExtraCallback = c0040onExtraCallback.IAuthTabCallback;
        }

        public void onExtraCallbackWithResult(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.onWarmupCompleted != -2147483647) {
                arrayList.add("br=" + this.onWarmupCompleted);
            }
            if (this.onExtraCallbackWithResult != -2147483647) {
                arrayList.add("tb=" + this.onExtraCallbackWithResult);
            }
            if (this.IAuthTabCallback != -9223372036854775807L) {
                arrayList.add("d=" + this.IAuthTabCallback);
            }
            if (!TextUtils.isEmpty(this.onNavigationEvent)) {
                arrayList.add("ot=" + this.onNavigationEvent);
            }
            arrayList.addAll(this.onExtraCallback);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll("CMCD-Object", arrayList);
        }
    }

    static final class onNavigationEvent {
        public final long IAuthTabCallback;
        public final String IAuthTabCallbackDefault;
        public final boolean asBinder;
        public final String onExtraCallback;
        public final ImmutableList<String> onExtraCallbackWithResult;
        public final long onNavigationEvent;
        public final long onWarmupCompleted;

        public static final class onExtraCallbackWithResult {
            private boolean IAuthTabCallbackStub;
            private String asInterface;
            private String onExtraCallback;
            private long onExtraCallbackWithResult = -9223372036854775807L;
            private long IAuthTabCallback = -2147483647L;
            private long onWarmupCompleted = -9223372036854775807L;
            private ImmutableList<String> onNavigationEvent = ImmutableList.of();

            public onExtraCallbackWithResult onExtraCallback(long j) {
                if (j == -9223372036854775807L) {
                    this.onExtraCallbackWithResult = j;
                    return this;
                }
                if (j >= 0) {
                    this.onExtraCallbackWithResult = ((j + 50) / 100) * 100;
                    return this;
                }
                throw new IllegalArgumentException();
            }

            public onExtraCallbackWithResult onNavigationEvent(long j) {
                if (j == -2147483647L) {
                    this.IAuthTabCallback = j;
                    return this;
                }
                if (j >= 0) {
                    this.IAuthTabCallback = ((j + 50) / 100) * 100;
                    return this;
                }
                throw new IllegalArgumentException();
            }

            public onExtraCallbackWithResult onWarmupCompleted(long j) {
                if (j == -9223372036854775807L) {
                    this.onWarmupCompleted = j;
                    return this;
                }
                if (j >= 0) {
                    this.onWarmupCompleted = ((j + 50) / 100) * 100;
                    return this;
                }
                throw new IllegalArgumentException();
            }

            public onExtraCallbackWithResult onWarmupCompleted(boolean z) {
                this.IAuthTabCallbackStub = z;
                return this;
            }

            public onExtraCallbackWithResult IAuthTabCallback(@Nullable String str) {
                this.onExtraCallback = str == null ? null : Uri.encode(str);
                return this;
            }

            public onExtraCallbackWithResult onExtraCallbackWithResult(@Nullable String str) {
                this.asInterface = str;
                return this;
            }

            public onExtraCallbackWithResult onNavigationEvent(List<String> list) {
                this.onNavigationEvent = ImmutableList.copyOf(list);
                return this;
            }

            public onNavigationEvent onExtraCallback() {
                return new onNavigationEvent(this);
            }
        }

        private onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
            this.onWarmupCompleted = onextracallbackwithresult.onExtraCallbackWithResult;
            this.IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback;
            this.onNavigationEvent = onextracallbackwithresult.onWarmupCompleted;
            this.asBinder = onextracallbackwithresult.IAuthTabCallbackStub;
            this.onExtraCallback = onextracallbackwithresult.onExtraCallback;
            this.IAuthTabCallbackDefault = onextracallbackwithresult.asInterface;
            this.onExtraCallbackWithResult = onextracallbackwithresult.onNavigationEvent;
        }

        public void onExtraCallbackWithResult(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.onWarmupCompleted != -9223372036854775807L) {
                arrayList.add("bl=" + this.onWarmupCompleted);
            }
            if (this.IAuthTabCallback != -2147483647L) {
                arrayList.add("mtp=" + this.IAuthTabCallback);
            }
            if (this.onNavigationEvent != -9223372036854775807L) {
                arrayList.add("dl=" + this.onNavigationEvent);
            }
            if (this.asBinder) {
                arrayList.add("su");
            }
            if (!TextUtils.isEmpty(this.onExtraCallback)) {
                arrayList.add(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("%s=\"%s\"", new Object[]{"nor", this.onExtraCallback}));
            }
            if (!TextUtils.isEmpty(this.IAuthTabCallbackDefault)) {
                arrayList.add(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("%s=\"%s\"", new Object[]{"nrr", this.IAuthTabCallbackDefault}));
            }
            arrayList.addAll(this.onExtraCallbackWithResult);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll("CMCD-Request", arrayList);
        }
    }

    static final class onExtraCallbackWithResult {
        public final ImmutableList<String> IAuthTabCallback;
        public final String IAuthTabCallbackStub;
        public final float onExtraCallback;
        public final String onExtraCallbackWithResult;
        public final String onNavigationEvent;
        public final String onWarmupCompleted;

        public static final class onNavigationEvent {
            private String asInterface;
            private String onExtraCallback;
            private String onNavigationEvent;
            private String onWarmupCompleted;
            private float onExtraCallbackWithResult = -3.4028235E38f;
            private ImmutableList<String> IAuthTabCallback = ImmutableList.of();

            public onNavigationEvent onNavigationEvent(@Nullable String str) {
                RecordingInputConnection_androidKt.onNavigationEvent(str == null || str.length() <= 64);
                this.onWarmupCompleted = str;
                return this;
            }

            public onNavigationEvent onExtraCallback(@Nullable String str) {
                RecordingInputConnection_androidKt.onNavigationEvent(str == null || str.length() <= 64);
                this.onExtraCallback = str;
                return this;
            }

            public onNavigationEvent onExtraCallbackWithResult(@Nullable String str) {
                this.asInterface = str;
                return this;
            }

            public onNavigationEvent IAuthTabCallback(@Nullable String str) {
                this.onNavigationEvent = str;
                return this;
            }

            public onNavigationEvent onWarmupCompleted(float f) {
                RecordingInputConnection_androidKt.onNavigationEvent(f > 0.0f || f == -3.4028235E38f);
                this.onExtraCallbackWithResult = f;
                return this;
            }

            public onNavigationEvent onWarmupCompleted(List<String> list) {
                this.IAuthTabCallback = ImmutableList.copyOf(list);
                return this;
            }

            public onExtraCallbackWithResult onNavigationEvent() {
                return new onExtraCallbackWithResult(this);
            }
        }

        private onExtraCallbackWithResult(onNavigationEvent onnavigationevent) {
            this.onNavigationEvent = onnavigationevent.onWarmupCompleted;
            this.onWarmupCompleted = onnavigationevent.onExtraCallback;
            this.IAuthTabCallbackStub = onnavigationevent.asInterface;
            this.onExtraCallbackWithResult = onnavigationevent.onNavigationEvent;
            this.onExtraCallback = onnavigationevent.onExtraCallbackWithResult;
            this.IAuthTabCallback = onnavigationevent.IAuthTabCallback;
        }

        public void onExtraCallback(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.onNavigationEvent)) {
                arrayList.add(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("%s=\"%s\"", new Object[]{"cid", this.onNavigationEvent}));
            }
            if (!TextUtils.isEmpty(this.onWarmupCompleted)) {
                arrayList.add(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("%s=\"%s\"", new Object[]{"sid", this.onWarmupCompleted}));
            }
            if (!TextUtils.isEmpty(this.IAuthTabCallbackStub)) {
                arrayList.add("sf=" + this.IAuthTabCallbackStub);
            }
            if (!TextUtils.isEmpty(this.onExtraCallbackWithResult)) {
                arrayList.add("st=" + this.onExtraCallbackWithResult);
            }
            float f = this.onExtraCallback;
            if (f != -3.4028235E38f && f != 1.0f) {
                arrayList.add(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("%s=%.2f", new Object[]{RVParams.PULL_REFRESH, Float.valueOf(f)}));
            }
            arrayList.addAll(this.IAuthTabCallback);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll("CMCD-Session", arrayList);
        }
    }

    static final class onWarmupCompleted {
        public final boolean onExtraCallbackWithResult;
        public final ImmutableList<String> onNavigationEvent;
        public final int onWarmupCompleted;

        public static final class onExtraCallbackWithResult {
            private boolean onExtraCallbackWithResult;
            private int onWarmupCompleted = -2147483647;
            private ImmutableList<String> onNavigationEvent = ImmutableList.of();

            public onExtraCallbackWithResult IAuthTabCallback(int i2) {
                RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 || i2 == -2147483647);
                if (i2 != -2147483647) {
                    i2 = ((i2 + 50) / 100) * 100;
                }
                this.onWarmupCompleted = i2;
                return this;
            }

            public onExtraCallbackWithResult onWarmupCompleted(boolean z) {
                this.onExtraCallbackWithResult = z;
                return this;
            }

            public onExtraCallbackWithResult onWarmupCompleted(List<String> list) {
                this.onNavigationEvent = ImmutableList.copyOf(list);
                return this;
            }

            public onWarmupCompleted onExtraCallback() {
                return new onWarmupCompleted(this);
            }
        }

        private onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
            this.onWarmupCompleted = onextracallbackwithresult.onWarmupCompleted;
            this.onExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult;
            this.onNavigationEvent = onextracallbackwithresult.onNavigationEvent;
        }

        public void onNavigationEvent(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.onWarmupCompleted != -2147483647) {
                arrayList.add("rtp=" + this.onWarmupCompleted);
            }
            if (this.onExtraCallbackWithResult) {
                arrayList.add("bs");
            }
            arrayList.addAll(this.onNavigationEvent);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll("CMCD-Status", arrayList);
        }
    }
}
