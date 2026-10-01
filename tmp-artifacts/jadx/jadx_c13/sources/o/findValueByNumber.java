package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class findValueByNumber<T, U> extends ObjectConverter2<T, U> {
    final deserializeIntNullableCollection<? super T, ? extends U> IAuthTabCallback;

    public findValueByNumber(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super T, ? extends U> deserializeintnullablecollection) {
        super(jsonReaderUnknownNumberParsing);
        this.IAuthTabCallback = deserializeintnullablecollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallback((deserializeShortCollection) ycxexternalsyntheticlambda0, this.IAuthTabCallback));
        } else {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(ycxexternalsyntheticlambda0, this.IAuthTabCallback));
        }
    }

    static final class onWarmupCompleted<T, U> extends access25400<T, U> {
        final deserializeIntNullableCollection<? super T, ? extends U> onExtraCallbackWithResult;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super U> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super T, ? extends U> deserializeintnullablecollection) {
            super(ycxexternalsyntheticlambda0);
            this.onExtraCallbackWithResult = deserializeintnullablecollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.IAuthTabCallbackStub) {
                return;
            }
            if (this.IAuthTabCallbackDefault != 0) {
                this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) null);
                return;
            }
            try {
                this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) floatExponent.onExtraCallbackWithResult(this.onExtraCallbackWithResult.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                onNavigationEvent(th);
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return onNavigationEvent(i);
        }

        @Override // o.parsePositiveDecimal
        public U poll() throws Exception {
            T tPoll = this.onTransact.poll();
            if (tPoll != null) {
                return (U) floatExponent.onExtraCallbackWithResult(this.onExtraCallbackWithResult.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class onExtraCallback<T, U> extends access25200<T, U> {
        final deserializeIntNullableCollection<? super T, ? extends U> onWarmupCompleted;

        onExtraCallback(deserializeShortCollection<? super U> deserializeshortcollection, deserializeIntNullableCollection<? super T, ? extends U> deserializeintnullablecollection) {
            super(deserializeshortcollection);
            this.onWarmupCompleted = deserializeintnullablecollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (this.IAuthTabCallbackDefault) {
                return;
            }
            if (this.asBinder != 0) {
                this.asInterface.onWarmupCompleted((ycxExternalSyntheticLambda0) null);
                return;
            }
            try {
                this.asInterface.onWarmupCompleted((deserializeShortCollection<? super R>) floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                IAuthTabCallback(th);
            }
        }

        @Override // o.deserializeShortCollection
        public boolean onExtraCallback(T t) {
            if (this.IAuthTabCallbackDefault) {
                return false;
            }
            try {
                return this.asInterface.onExtraCallback((deserializeShortCollection<? super R>) floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                IAuthTabCallback(th);
                return true;
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return onNavigationEvent(i);
        }

        @Override // o.parsePositiveDecimal
        public U poll() throws Exception {
            T tPoll = this.IAuthTabCallbackStub.poll();
            if (tPoll != null) {
                return (U) floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
