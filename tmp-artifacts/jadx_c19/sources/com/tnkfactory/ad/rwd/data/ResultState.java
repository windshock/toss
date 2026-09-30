package com.tnkfactory.ad.rwd.data;

import com.tnkfactory.ad.TnkError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ResultState<T> implements ErrorGettable {

    public static final class Error<T> extends ResultState<T> {
        private final TnkError e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull TnkError tnkError) {
            super(null);
            Intrinsics.checkNotNullParameter(tnkError, "");
            this.e = tnkError;
        }

        public final TnkError getE() {
            return this.e;
        }
    }

    public static final class Pass extends ResultState {
        public static final Pass INSTANCE = new Pass();

        private Pass() {
            super(null);
        }
    }

    public static final class Success<T> extends ResultState<T> {
        private final T value;

        public Success(T t) {
            super(null);
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public /* synthetic */ ResultState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.tnkfactory.ad.rwd.data.ErrorGettable
    public TnkError getErrorIfExists() {
        if (this instanceof Error) {
            return ((Error) this).getE();
        }
        return null;
    }

    private ResultState() {
    }
}
