package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UUIDConverter1<T> extends ObjectConverter2<T, T> {
    final deserializeLongCollection<? super T> onExtraCallback;

    public UUIDConverter1(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeLongCollection<? super T> deserializelongcollection) {
        super(jsonReaderUnknownNumberParsing);
        this.onExtraCallback = deserializelongcollection;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallbackWithResult((deserializeShortCollection) ycxexternalsyntheticlambda0, this.onExtraCallback));
        } else {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onExtraCallback(ycxexternalsyntheticlambda0, this.onExtraCallback));
        }
    }

    static final class onExtraCallback<T> extends access25400<T, T> implements deserializeShortCollection<T> {
        final deserializeLongCollection<? super T> onNavigationEvent;

        onExtraCallback(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeLongCollection<? super T> deserializelongcollection) {
            super(ycxexternalsyntheticlambda0);
            this.onNavigationEvent = deserializelongcollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (onExtraCallback((onExtraCallback<T>) t)) {
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
                this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) null);
                return true;
            }
            try {
                boolean zTest = this.onNavigationEvent.test(t);
                if (zTest) {
                    this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) t);
                }
                return zTest;
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
            parsePositiveInt<T> parsepositiveint = this.onTransact;
            deserializeLongCollection<? super T> deserializelongcollection = this.onNavigationEvent;
            while (true) {
                T tPoll = parsepositiveint.poll();
                if (tPoll == null) {
                    return null;
                }
                if (deserializelongcollection.test(tPoll)) {
                    return tPoll;
                }
                if (this.IAuthTabCallbackDefault == 2) {
                    parsepositiveint.request(1L);
                }
            }
        }
    }

    static final class onExtraCallbackWithResult<T> extends access25200<T, T> {
        final deserializeLongCollection<? super T> onNavigationEvent;

        onExtraCallbackWithResult(deserializeShortCollection<? super T> deserializeshortcollection, deserializeLongCollection<? super T> deserializelongcollection) {
            super(deserializeshortcollection);
            this.onNavigationEvent = deserializelongcollection;
        }

        @Override // o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(T t) {
            if (onExtraCallback((onExtraCallbackWithResult<T>) t)) {
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
                return this.asInterface.onExtraCallback((deserializeShortCollection<? super R>) null);
            }
            try {
                return this.onNavigationEvent.test(t) && this.asInterface.onExtraCallback((deserializeShortCollection<? super R>) t);
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
            parsePositiveInt<T> parsepositiveint = this.IAuthTabCallbackStub;
            deserializeLongCollection<? super T> deserializelongcollection = this.onNavigationEvent;
            while (true) {
                T tPoll = parsepositiveint.poll();
                if (tPoll == null) {
                    return null;
                }
                if (deserializelongcollection.test(tPoll)) {
                    return tPoll;
                }
                if (this.asBinder == 2) {
                    parsepositiveint.request(1L);
                }
            }
        }
    }
}
