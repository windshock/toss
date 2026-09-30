package com.alibaba.ariver.ipc.uniform;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CustomCLObjectInputStream extends ObjectInputStream {
    private ClassLoader classLoader;

    protected CustomCLObjectInputStream() throws IOException {
    }

    public CustomCLObjectInputStream(InputStream inputStream, ClassLoader classLoader) throws IOException {
        super(inputStream);
        this.classLoader = classLoader;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        try {
            return super.resolveClass(objectStreamClass);
        } catch (Exception e) {
            RVLogger.e("MyObjectInputStream", "", e);
            return Class.forName(objectStreamClass.getName(), true, this.classLoader);
        }
    }
}
