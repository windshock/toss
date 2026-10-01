package o;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionStateKtExternalSyntheticLambda1 implements Cache {
    private static final HashSet<File> IAuthTabCallback = new HashSet<>();
    private final Random IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private final boolean access000;
    private Cache.CacheException asBinder;
    private final HashMap<String, ArrayList<Cache.onNavigationEvent>> asInterface;
    private final File onExtraCallback;
    private final TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1 onExtraCallbackWithResult;
    private final TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 onNavigationEvent;
    private boolean onTransact;
    private final TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2 onWarmupCompleted;

    public TextFieldSelectionStateKtExternalSyntheticLambda1(File file, TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2, TextLayoutStateExternalSyntheticLambda0 textLayoutStateExternalSyntheticLambda0) {
        this(file, textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2, textLayoutStateExternalSyntheticLambda0, null, false, false);
    }

    public TextFieldSelectionStateKtExternalSyntheticLambda1(File file, TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2, @Nullable TextLayoutStateExternalSyntheticLambda0 textLayoutStateExternalSyntheticLambda0, @Nullable byte[] bArr, boolean z, boolean z2) {
        this(file, textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2, new TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1(textLayoutStateExternalSyntheticLambda0, file, bArr, z, z2), (textLayoutStateExternalSyntheticLambda0 == null || z2) ? null : new TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3(textLayoutStateExternalSyntheticLambda0));
    }

    TextFieldSelectionStateKtExternalSyntheticLambda1(File file, TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2, TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1, @Nullable TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3) {
        if (!onExtraCallbackWithResult(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.onExtraCallback = file;
        this.onWarmupCompleted = textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2;
        this.onExtraCallbackWithResult = textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1;
        this.onNavigationEvent = textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3;
        this.asInterface = new HashMap<>();
        this.IAuthTabCallbackDefault = new Random();
        this.access000 = textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2.IAuthTabCallback();
        this.IAuthTabCallbackStubProxy = -1L;
        final ConditionVariable conditionVariable = new ConditionVariable();
        new Thread("ExoPlayer:SimpleCacheInit") { // from class: o.TextFieldSelectionStateKtExternalSyntheticLambda1.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                synchronized (TextFieldSelectionStateKtExternalSyntheticLambda1.this) {
                    conditionVariable.open();
                    TextFieldSelectionStateKtExternalSyntheticLambda1.this.IAuthTabCallback();
                    TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda2 unused = TextFieldSelectionStateKtExternalSyntheticLambda1.this.onWarmupCompleted;
                }
            }
        }.start();
        conditionVariable.block();
    }

    public void onExtraCallback() throws Cache.CacheException {
        synchronized (this) {
            Cache.CacheException cacheException = this.asBinder;
            if (cacheException != null) {
                throw cacheException;
            }
        }
    }

    public NavigableSet<TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0> onExtraCallbackWithResult(String str) {
        TreeSet treeSet;
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(str);
            if (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted == null || textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult()) {
                treeSet = new TreeSet();
            } else {
                treeSet = new TreeSet((Collection) textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallback());
            }
        }
        return treeSet;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public long onNavigationEvent() {
        long j;
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            j = this.IAuthTabCallbackStub;
        }
        return j;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 onExtraCallback(String str, long j, long j2) throws InterruptedException, Cache.CacheException {
        TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnNavigationEvent;
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            onExtraCallback();
            while (true) {
                textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(str, j, j2);
                if (textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnNavigationEvent == null) {
                    wait();
                }
            }
        }
        return textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0OnNavigationEvent;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 onNavigationEvent(String str, long j, long j2) throws Cache.CacheException {
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            onExtraCallback();
            TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallbackStub = IAuthTabCallbackStub(str, j, j2);
            if (textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallbackStub.IAuthTabCallback) {
                return onNavigationEvent(str, textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallbackStub);
            }
            if (this.onExtraCallbackWithResult.onNavigationEvent(str).onExtraCallback(j, textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallbackStub.onExtraCallback)) {
                return textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallbackStub;
            }
            return null;
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public File IAuthTabCallback(String str, long j, long j2) throws Cache.CacheException {
        File fileOnExtraCallbackWithResult;
        synchronized (this) {
            try {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
                onExtraCallback();
                TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(str);
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onNavigationEvent(j, j2));
                if (!this.onExtraCallback.exists()) {
                    onWarmupCompleted(this.onExtraCallback);
                    onExtraCallbackWithResult();
                }
                this.onWarmupCompleted.IAuthTabCallback(this, str, j, j2);
                File file = new File(this.onExtraCallback, Integer.toString(this.IAuthTabCallbackDefault.nextInt(10)));
                if (!file.exists()) {
                    onWarmupCompleted(file);
                }
                fileOnExtraCallbackWithResult = TextFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallbackWithResult(file, textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onNavigationEvent, j, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileOnExtraCallbackWithResult;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void onNavigationEvent(File file, long j) throws Cache.CacheException {
        synchronized (this) {
            boolean z = true;
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            if (file.exists()) {
                if (j == 0) {
                    file.delete();
                    return;
                }
                TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2 = (TextFieldSelectionStateKtExternalSyntheticLambda2) RecordingInputConnection_androidKt.onExtraCallbackWithResult(TextFieldSelectionStateKtExternalSyntheticLambda2.IAuthTabCallback(file, j, this.onExtraCallbackWithResult));
                TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = (TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onWarmupCompleted(textFieldSelectionStateKtExternalSyntheticLambda2.onWarmupCompleted));
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onNavigationEvent(textFieldSelectionStateKtExternalSyntheticLambda2.IAuthTabCallbackDefault, textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback));
                long jIAuthTabCallback = TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2.IAuthTabCallback(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.IAuthTabCallback());
                if (jIAuthTabCallback != -1) {
                    if (textFieldSelectionStateKtExternalSyntheticLambda2.IAuthTabCallbackDefault + textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback > jIAuthTabCallback) {
                        z = false;
                    }
                    RecordingInputConnection_androidKt.onExtraCallbackWithResult(z);
                }
                if (this.onNavigationEvent != null) {
                    try {
                        this.onNavigationEvent.onExtraCallback(file.getName(), textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback, textFieldSelectionStateKtExternalSyntheticLambda2.onNavigationEvent);
                        onNavigationEvent(textFieldSelectionStateKtExternalSyntheticLambda2);
                        try {
                            this.onExtraCallbackWithResult.IAuthTabCallback();
                            notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new Cache.CacheException(e);
                        }
                    } catch (IOException e2) {
                        throw new Cache.CacheException(e2);
                    }
                }
                onNavigationEvent(textFieldSelectionStateKtExternalSyntheticLambda2);
                this.onExtraCallbackWithResult.IAuthTabCallback();
                notifyAll();
                return;
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void onExtraCallbackWithResult(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 = (TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onWarmupCompleted(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onWarmupCompleted));
            textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onWarmupCompleted(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.IAuthTabCallbackDefault);
            this.onExtraCallbackWithResult.IAuthTabCallbackDefault(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0.onExtraCallbackWithResult);
            notifyAll();
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void IAuthTabCallback(String str) {
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            Iterator<TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0> it = onExtraCallbackWithResult(str).iterator();
            while (it.hasNext()) {
                onNavigationEvent(it.next());
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void IAuthTabCallback(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            onNavigationEvent(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public long onWarmupCompleted(String str, long j, long j2) {
        long jOnWarmupCompleted;
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            if (j2 == -1) {
                j2 = Long.MAX_VALUE;
            }
            TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(str);
            jOnWarmupCompleted = textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted != null ? textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onWarmupCompleted(j, j2) : -j2;
        }
        return jOnWarmupCompleted;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public long onExtraCallbackWithResult(String str, long j, long j2) {
        long j3;
        synchronized (this) {
            long j4 = j2 == -1 ? Long.MAX_VALUE : j + j2;
            long j5 = j4 < 0 ? Long.MAX_VALUE : j4;
            long j6 = j;
            j3 = 0;
            while (j6 < j5) {
                long jOnWarmupCompleted = onWarmupCompleted(str, j6, j5 - j6);
                if (jOnWarmupCompleted > 0) {
                    j3 += jOnWarmupCompleted;
                } else {
                    jOnWarmupCompleted = -jOnWarmupCompleted;
                }
                j6 += jOnWarmupCompleted;
            }
        }
        return j3;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public void onWarmupCompleted(String str, TextFieldSelectionState_androidKtExternalSyntheticLambda1 textFieldSelectionState_androidKtExternalSyntheticLambda1) throws Cache.CacheException {
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            onExtraCallback();
            this.onExtraCallbackWithResult.onExtraCallback(str, textFieldSelectionState_androidKtExternalSyntheticLambda1);
            try {
                this.onExtraCallbackWithResult.IAuthTabCallback();
            } catch (IOException e) {
                throw new Cache.CacheException(e);
            }
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 onNavigationEvent(String str) {
        TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2 textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2OnExtraCallback;
        synchronized (this) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.onTransact);
            textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2OnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback(str);
        }
        return textFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda2OnExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback() {
        if (!this.onExtraCallback.exists()) {
            try {
                onWarmupCompleted(this.onExtraCallback);
            } catch (Cache.CacheException e) {
                this.asBinder = e;
                return;
            }
        }
        File[] fileArrListFiles = this.onExtraCallback.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.onExtraCallback;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SimpleCache", str);
            this.asBinder = new Cache.CacheException(str);
            return;
        }
        long jOnWarmupCompleted = onWarmupCompleted(fileArrListFiles);
        this.IAuthTabCallbackStubProxy = jOnWarmupCompleted;
        if (jOnWarmupCompleted == -1) {
            try {
                this.IAuthTabCallbackStubProxy = IAuthTabCallback(this.onExtraCallback);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.onExtraCallback;
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SimpleCache", str2, e2);
                this.asBinder = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            this.onExtraCallbackWithResult.onExtraCallback(this.IAuthTabCallbackStubProxy);
            TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 = this.onNavigationEvent;
            if (textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 != null) {
                textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy);
                Map<String, TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1> mapOnNavigationEvent = this.onNavigationEvent.onNavigationEvent();
                IAuthTabCallback(this.onExtraCallback, true, fileArrListFiles, mapOnNavigationEvent);
                this.onNavigationEvent.onExtraCallback(mapOnNavigationEvent.keySet());
            } else {
                IAuthTabCallback(this.onExtraCallback, true, fileArrListFiles, null);
            }
            this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            try {
                this.onExtraCallbackWithResult.IAuthTabCallback();
            } catch (IOException e3) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.onExtraCallback;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SimpleCache", str3, e4);
            this.asBinder = new Cache.CacheException(str3, e4);
        }
    }

    private void IAuthTabCallback(File file, boolean z, @Nullable File[] fileArr, @Nullable Map<String, TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1> map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                IAuthTabCallback(file2, false, file2.listFiles(), map);
            } else if (!z || (!TextFieldSelectionStateTextFieldTextDragObserverExternalSyntheticLambda1.IAuthTabCallback(name) && !name.endsWith(".uid"))) {
                TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1Remove = map != null ? map.remove(name) : null;
                if (textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1Remove != null) {
                    j2 = textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1Remove.onWarmupCompleted;
                    j = textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1Remove.onExtraCallback;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallback = TextFieldSelectionStateKtExternalSyntheticLambda2.IAuthTabCallback(file2, j2, j, this.onExtraCallbackWithResult);
                if (textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallback != null) {
                    onNavigationEvent(textFieldSelectionStateKtExternalSyntheticLambda2IAuthTabCallback);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private TextFieldSelectionStateKtExternalSyntheticLambda2 onNavigationEvent(String str, TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2) throws Throwable {
        boolean z;
        if (!this.access000) {
            return textFieldSelectionStateKtExternalSyntheticLambda2;
        }
        String name = ((File) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallbackWithResult)).getName();
        long j = textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback;
        long jCurrentTimeMillis = System.currentTimeMillis();
        TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 = this.onNavigationEvent;
        if (textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 != null) {
            try {
                textFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3.onExtraCallback(name, j, jCurrentTimeMillis);
            } catch (IOException unused) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2OnWarmupCompleted = ((TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult.onWarmupCompleted(str))).onWarmupCompleted(textFieldSelectionStateKtExternalSyntheticLambda2, jCurrentTimeMillis, z);
        onExtraCallbackWithResult(textFieldSelectionStateKtExternalSyntheticLambda2, textFieldSelectionStateKtExternalSyntheticLambda2OnWarmupCompleted);
        return textFieldSelectionStateKtExternalSyntheticLambda2OnWarmupCompleted;
    }

    private TextFieldSelectionStateKtExternalSyntheticLambda2 IAuthTabCallbackStub(String str, long j, long j2) {
        TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult;
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(str);
        if (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted == null) {
            return TextFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallbackWithResult(str, j, j2);
        }
        while (true) {
            textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult = textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult(j, j2);
            if (!textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.IAuthTabCallback || ((File) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.onExtraCallbackWithResult)).length() == textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult.onExtraCallback) {
                break;
            }
            onExtraCallbackWithResult();
        }
        return textFieldSelectionStateKtExternalSyntheticLambda2OnExtraCallbackWithResult;
    }

    private void onNavigationEvent(TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2) {
        this.onExtraCallbackWithResult.onNavigationEvent(textFieldSelectionStateKtExternalSyntheticLambda2.onWarmupCompleted).IAuthTabCallback(textFieldSelectionStateKtExternalSyntheticLambda2);
        this.IAuthTabCallbackStub += textFieldSelectionStateKtExternalSyntheticLambda2.onExtraCallback;
        onWarmupCompleted(textFieldSelectionStateKtExternalSyntheticLambda2);
    }

    private void onNavigationEvent(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0 textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onWarmupCompleted);
        if (textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted == null || !textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0)) {
            return;
        }
        this.IAuthTabCallbackStub -= textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onExtraCallback;
        if (this.onNavigationEvent != null) {
            String name = ((File) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onExtraCallbackWithResult)).getName();
            try {
                this.onNavigationEvent.onWarmupCompleted(name);
            } catch (IOException unused) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.onExtraCallbackWithResult.IAuthTabCallbackDefault(textFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0OnWarmupCompleted.onExtraCallbackWithResult);
        onExtraCallback(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
    }

    private void onExtraCallbackWithResult() {
        ArrayList arrayList = new ArrayList();
        Iterator<TextFieldSelectionStateselectionHandleGestures2ExternalSyntheticLambda0> it = this.onExtraCallbackWithResult.onExtraCallback().iterator();
        while (it.hasNext()) {
            Iterator<TextFieldSelectionStateKtExternalSyntheticLambda2> it2 = it.next().onExtraCallback().iterator();
            while (it2.hasNext()) {
                TextFieldSelectionStateKtExternalSyntheticLambda2 next = it2.next();
                if (((File) RecordingInputConnection_androidKt.onExtraCallbackWithResult(next.onExtraCallbackWithResult)).length() != next.onExtraCallback) {
                    arrayList.add(next);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            onNavigationEvent((TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) arrayList.get(i2));
        }
    }

    private void onExtraCallback(TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        ArrayList<Cache.onNavigationEvent> arrayList = this.asInterface.get(textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0.onWarmupCompleted);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onExtraCallbackWithResult(this, textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
            }
        }
        this.onWarmupCompleted.onExtraCallbackWithResult(this, textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
    }

    private void onWarmupCompleted(TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2) {
        ArrayList<Cache.onNavigationEvent> arrayList = this.asInterface.get(textFieldSelectionStateKtExternalSyntheticLambda2.onWarmupCompleted);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onExtraCallback(this, textFieldSelectionStateKtExternalSyntheticLambda2);
            }
        }
        this.onWarmupCompleted.onExtraCallback(this, textFieldSelectionStateKtExternalSyntheticLambda2);
    }

    private void onExtraCallbackWithResult(TextFieldSelectionStateKtExternalSyntheticLambda2 textFieldSelectionStateKtExternalSyntheticLambda2, TextFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0 textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0) {
        ArrayList<Cache.onNavigationEvent> arrayList = this.asInterface.get(textFieldSelectionStateKtExternalSyntheticLambda2.onWarmupCompleted);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).onWarmupCompleted(this, textFieldSelectionStateKtExternalSyntheticLambda2, textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
            }
        }
        this.onWarmupCompleted.onWarmupCompleted(this, textFieldSelectionStateKtExternalSyntheticLambda2, textFieldSelectionStatecursorHandleGestures23ExternalSyntheticLambda0);
    }

    private static long onWarmupCompleted(File[] fileArr) {
        int length = fileArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file = fileArr[i2];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return onExtraCallback(name);
                } catch (NumberFormatException unused) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static long IAuthTabCallback(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + ".uid");
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private static long onExtraCallback(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private static void onWarmupCompleted(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private static boolean onExtraCallbackWithResult(File file) {
        boolean zAdd;
        synchronized (TextFieldSelectionStateKtExternalSyntheticLambda1.class) {
            zAdd = IAuthTabCallback.add(file.getAbsoluteFile());
        }
        return zAdd;
    }
}
