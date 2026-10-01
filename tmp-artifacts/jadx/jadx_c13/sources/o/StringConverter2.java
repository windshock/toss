package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class StringConverter2<T> extends ObjectConverter2<T, T> {
    final deserializeFloat<? super Throwable> IAuthTabCallback;
    final deserializeDecimalCollection onExtraCallback;
    final deserializeDecimalCollection onNavigationEvent;
    final deserializeFloat<? super T> onWarmupCompleted;

    public StringConverter2(JsonReaderUnknownNumberParsing<T> jsonReaderUnknownNumberParsing, deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
        super(jsonReaderUnknownNumberParsing);
        this.onWarmupCompleted = deserializefloat;
        this.IAuthTabCallback = deserializefloat2;
        this.onExtraCallback = deserializedecimalcollection;
        this.onNavigationEvent = deserializedecimalcollection2;
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        if (ycxexternalsyntheticlambda0 instanceof deserializeShortCollection) {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onNavigationEvent((deserializeShortCollection) ycxexternalsyntheticlambda0, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallback, this.onNavigationEvent));
        } else {
            this.onExtraCallbackWithResult.onExtraCallback((JsonReaderReadObject) new onWarmupCompleted(ycxexternalsyntheticlambda0, this.onWarmupCompleted, this.IAuthTabCallback, this.onExtraCallback, this.onNavigationEvent));
        }
    }

    static final class onWarmupCompleted<T> extends access25400<T, T> {
        final deserializeDecimalCollection IAuthTabCallback;
        final deserializeFloat<? super Throwable> onExtraCallback;
        final deserializeFloat<? super T> onExtraCallbackWithResult;
        final deserializeDecimalCollection onWarmupCompleted;

        onWarmupCompleted(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
            super(ycxexternalsyntheticlambda0);
            this.onExtraCallbackWithResult = deserializefloat;
            this.onExtraCallback = deserializefloat2;
            this.IAuthTabCallback = deserializedecimalcollection;
            this.onWarmupCompleted = deserializedecimalcollection2;
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
                this.onExtraCallbackWithResult.accept(t);
                this.asBinder.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) t);
            } catch (Throwable th) {
                onNavigationEvent(th);
            }
        }

        @Override // o.access25400, o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.IAuthTabCallbackStub) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.IAuthTabCallbackStub = true;
            try {
                this.onExtraCallback.accept(th);
                this.asBinder.onWarmupCompleted(th);
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.asBinder.onWarmupCompleted((Throwable) new deserializeDecimal(th, th2));
            }
            try {
                this.onWarmupCompleted.run();
            } catch (Throwable th3) {
                NumberConverter.onWarmupCompleted(th3);
                RxJavaPlugins.onExtraCallbackWithResult(th3);
            }
        }

        @Override // o.access25400, o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.IAuthTabCallbackStub) {
                return;
            }
            try {
                this.IAuthTabCallback.run();
                this.IAuthTabCallbackStub = true;
                this.asBinder.onExtraCallbackWithResult();
                try {
                    this.onWarmupCompleted.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
            } catch (Throwable th2) {
                onNavigationEvent(th2);
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return onNavigationEvent(i);
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            deserializeDecimal deserializedecimal;
            try {
                T tPoll = this.onTransact.poll();
                if (tPoll != null) {
                    try {
                        this.onExtraCallbackWithResult.accept(tPoll);
                        return tPoll;
                    } catch (Throwable th) {
                        try {
                            NumberConverter.onWarmupCompleted(th);
                            try {
                                this.onExtraCallback.accept(th);
                                throw access26100.IAuthTabCallback(th);
                            } finally {
                            }
                        } finally {
                            this.onWarmupCompleted.run();
                        }
                    }
                }
                if (this.IAuthTabCallbackDefault == 1) {
                    this.IAuthTabCallback.run();
                }
                return tPoll;
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                try {
                    this.onExtraCallback.accept(th2);
                    throw access26100.IAuthTabCallback(th2);
                } finally {
                }
            }
        }
    }

    static final class onNavigationEvent<T> extends access25200<T, T> {
        final deserializeDecimalCollection onExtraCallback;
        final deserializeDecimalCollection onExtraCallbackWithResult;
        final deserializeFloat<? super T> onNavigationEvent;
        final deserializeFloat<? super Throwable> onWarmupCompleted;

        onNavigationEvent(deserializeShortCollection<? super T> deserializeshortcollection, deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2) {
            super(deserializeshortcollection);
            this.onNavigationEvent = deserializefloat;
            this.onWarmupCompleted = deserializefloat2;
            this.onExtraCallback = deserializedecimalcollection;
            this.onExtraCallbackWithResult = deserializedecimalcollection2;
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
                this.onNavigationEvent.accept(t);
                this.asInterface.onWarmupCompleted((ycxExternalSyntheticLambda0) t);
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
                this.onNavigationEvent.accept(t);
                return this.asInterface.onExtraCallback((deserializeShortCollection<? super R>) t);
            } catch (Throwable th) {
                IAuthTabCallback(th);
                return false;
            }
        }

        @Override // o.access25200, o.ycxExternalSyntheticLambda0
        public void onWarmupCompleted(Throwable th) {
            if (this.IAuthTabCallbackDefault) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.IAuthTabCallbackDefault = true;
            try {
                this.onWarmupCompleted.accept(th);
                this.asInterface.onWarmupCompleted(th);
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.asInterface.onWarmupCompleted(new deserializeDecimal(th, th2));
            }
            try {
                this.onExtraCallbackWithResult.run();
            } catch (Throwable th3) {
                NumberConverter.onWarmupCompleted(th3);
                RxJavaPlugins.onExtraCallbackWithResult(th3);
            }
        }

        @Override // o.access25200, o.ycxExternalSyntheticLambda0
        public void onExtraCallbackWithResult() {
            if (this.IAuthTabCallbackDefault) {
                return;
            }
            try {
                this.onExtraCallback.run();
                this.IAuthTabCallbackDefault = true;
                this.asInterface.onExtraCallbackWithResult();
                try {
                    this.onExtraCallbackWithResult.run();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    RxJavaPlugins.onExtraCallbackWithResult(th);
                }
            } catch (Throwable th2) {
                IAuthTabCallback(th2);
            }
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            return onNavigationEvent(i);
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            deserializeDecimal deserializedecimal;
            try {
                T tPoll = this.IAuthTabCallbackStub.poll();
                if (tPoll != null) {
                    try {
                        this.onNavigationEvent.accept(tPoll);
                        return tPoll;
                    } catch (Throwable th) {
                        try {
                            NumberConverter.onWarmupCompleted(th);
                            try {
                                this.onWarmupCompleted.accept(th);
                                throw access26100.IAuthTabCallback(th);
                            } finally {
                            }
                        } finally {
                            this.onExtraCallbackWithResult.run();
                        }
                    }
                }
                if (this.asBinder == 1) {
                    this.onExtraCallback.run();
                }
                return tPoll;
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                try {
                    this.onWarmupCompleted.accept(th2);
                    throw access26100.IAuthTabCallback(th2);
                } finally {
                }
            }
        }
    }
}
