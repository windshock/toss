package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StringConverter1<T, K> extends ObjectConverter2<T, T> {
    final deserializeIntNullableCollection<? super T, K> onExtraCallback;
    final deserializeFloatCollection<? super K, ? super K> onWarmupCompleted;

    public StringConverter1(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection, deserializeFloatCollection<? super K, ? super K> deserializefloatcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = deserializeintnullablecollection;
        this.onWarmupCompleted = deserializefloatcollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onNavigationEvent((deserializeShortCollection) ycxexternalsyntheticlambda0, this.onExtraCallback, this.onWarmupCompleted));
        } else {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(ycxexternalsyntheticlambda0, this.onExtraCallback, this.onWarmupCompleted));
        }
    }

    static final class onWarmupCompleted<T, K> extends access25400<T, T> implements deserializeShortCollection<T> {
        final deserializeFloatCollection<? super K, ? super K> IAuthTabCallback;
        boolean onExtraCallbackWithResult;
        final deserializeIntNullableCollection<? super T, K> onNavigationEvent;
        K onWarmupCompleted;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection, deserializeFloatCollection<? super K, ? super K> deserializefloatcollection) {
            super(ycxexternalsyntheticlambda0);
            this.onNavigationEvent = deserializeintnullablecollection;
            this.IAuthTabCallback = deserializefloatcollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (onExtraCallback((onWarmupCompleted<T, K>) t)) {
                return;
            }
            this.asInterface.request(1L);
        }

        @Override // o.deserializeShortCollection
        public boolean onExtraCallback(T t) {
            if (this.IAuthTabCallbackStub) {
                return false;
            }
            if (this.IAuthTabCallbackDefault != 0) {
                this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) t);
                return true;
            }
            try {
                K kApply = this.onNavigationEvent.apply(t);
                if (this.onExtraCallbackWithResult) {
                    boolean zIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted, kApply);
                    this.onWarmupCompleted = kApply;
                    if (zIAuthTabCallback) {
                        return false;
                    }
                } else {
                    this.onExtraCallbackWithResult = true;
                    this.onWarmupCompleted = kApply;
                }
                this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) t);
                return true;
            } catch (Throwable th) {
                onNavigationEvent(th);
                return true;
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return onNavigationEvent(i);
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.onTransact.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.onNavigationEvent.apply(tPoll);
                if (!this.onExtraCallbackWithResult) {
                    this.onExtraCallbackWithResult = true;
                    this.onWarmupCompleted = kApply;
                    return tPoll;
                }
                if (!this.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted, kApply)) {
                    this.onWarmupCompleted = kApply;
                    return tPoll;
                }
                this.onWarmupCompleted = kApply;
                if (this.IAuthTabCallbackDefault != 1) {
                    this.asInterface.request(1L);
                }
            }
        }
    }

    static final class onNavigationEvent<T, K> extends access25200<T, T> {
        boolean IAuthTabCallback;
        final deserializeFloatCollection<? super K, ? super K> onExtraCallback;
        final deserializeIntNullableCollection<? super T, K> onNavigationEvent;
        K onWarmupCompleted;

        onNavigationEvent(deserializeShortCollection<? super T> deserializeshortcollection, deserializeIntNullableCollection<? super T, K> deserializeintnullablecollection, deserializeFloatCollection<? super K, ? super K> deserializefloatcollection) {
            super(deserializeshortcollection);
            this.onNavigationEvent = deserializeintnullablecollection;
            this.onExtraCallback = deserializefloatcollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (onExtraCallback((onNavigationEvent<T, K>) t)) {
                return;
            }
            this.onTransact.request(1L);
        }

        @Override // o.deserializeShortCollection
        public boolean onExtraCallback(T t) {
            if (this.IAuthTabCallbackDefault) {
                return false;
            }
            if (this.asBinder != 0) {
                return this.asInterface.onExtraCallback((deserializeShortCollection<? super R>) t);
            }
            try {
                K kApply = this.onNavigationEvent.apply(t);
                if (this.IAuthTabCallback) {
                    boolean zIAuthTabCallback = this.onExtraCallback.IAuthTabCallback(this.onWarmupCompleted, kApply);
                    this.onWarmupCompleted = kApply;
                    if (zIAuthTabCallback) {
                        return false;
                    }
                } else {
                    this.IAuthTabCallback = true;
                    this.onWarmupCompleted = kApply;
                }
                this.asInterface.onWarmupCompleted((ycxExternalSyntheticLambda0) t);
                return true;
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
        public T poll() throws Exception {
            while (true) {
                T tPoll = this.IAuthTabCallbackStub.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.onNavigationEvent.apply(tPoll);
                if (!this.IAuthTabCallback) {
                    this.IAuthTabCallback = true;
                    this.onWarmupCompleted = kApply;
                    return tPoll;
                }
                if (!this.onExtraCallback.IAuthTabCallback(this.onWarmupCompleted, kApply)) {
                    this.onWarmupCompleted = kApply;
                    return tPoll;
                }
                this.onWarmupCompleted = kApply;
                if (this.asBinder != 1) {
                    this.onTransact.request(1L);
                }
            }
        }
    }
}
