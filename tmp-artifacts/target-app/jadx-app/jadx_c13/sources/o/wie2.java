package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class wie2 implements row {
    public static final IAuthTabCallback Default = new IAuthTabCallback(null);
    private final setPreError _schemaCache;
    private final changeVideoState configuration;
    private final hfycx serializersModule;

    public /* synthetic */ wie2(changeVideoState changevideostate, hfycx hfycxVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(changevideostate, hfycxVar);
    }

    private wie2(changeVideoState changevideostate, hfycx hfycxVar) {
        this.configuration = changevideostate;
        this.serializersModule = hfycxVar;
        this._schemaCache = new setPreError();
    }

    public final changeVideoState IAuthTabCallback() {
        return this.configuration;
    }

    @Override // o.nq
    public hfycx onExtraCallback() {
        return this.serializersModule;
    }

    public final setPreError onExtraCallbackWithResult() {
        return this._schemaCache;
    }

    public static final class IAuthTabCallback extends wie2 {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
            super(new changeVideoState(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), tnycx.onNavigationEvent(), null);
        }
    }

    @Override // o.row
    public final <T> String onWarmupCompleted(@NotNull py<? super T> pyVar, T t) {
        Intrinsics.checkNotNullParameter(pyVar, "");
        pauseTimers pausetimers = new pauseTimers();
        try {
            fbydj.onNavigationEvent(this, pausetimers, pyVar, t);
            return pausetimers.toString();
        } finally {
            pausetimers.onExtraCallback();
        }
    }

    @Override // o.row
    public final <T> T onExtraCallback(@NotNull jp<? extends T> jpVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(jpVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        isNull isnullOnWarmupCompleted = syaycx2.onWarmupCompleted(this, str);
        T t = (T) new getColumnNames(this, cypher4Encrypt.OBJ, isnullOnWarmupCompleted, jpVar.getDescriptor(), null).onWarmupCompleted(jpVar);
        isnullOnWarmupCompleted.access100();
        return t;
    }

    public final <T> JsonElement IAuthTabCallback(@NotNull py<? super T> pyVar, T t) {
        Intrinsics.checkNotNullParameter(pyVar, "");
        return djsya.onNavigationEvent(this, t, pyVar);
    }

    public final <T> T onExtraCallbackWithResult(@NotNull jp<? extends T> jpVar, @NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jpVar, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return (T) cypher4Decrypt.onExtraCallback(this, jsonElement, jpVar);
    }

    public final JsonElement onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (JsonElement) onExtraCallback(clickEvent.onExtraCallback, str);
    }
}
