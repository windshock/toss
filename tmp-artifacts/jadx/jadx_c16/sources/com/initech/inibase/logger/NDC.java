package com.initech.inibase.logger;

import com.initech.inibase.logger.helpers.LogLog;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class NDC {
    private static Hashtable a = new Hashtable();
    private static int b = 0;

    private NDC() {
    }

    public static void clear() {
        Stack stack = (Stack) a.get(Thread.currentThread());
        if (stack != null) {
            stack.setSize(0);
        }
    }

    public static Stack cloneStack() {
        Object obj = a.get(Thread.currentThread());
        if (obj == null) {
            return null;
        }
        return (Stack) ((Stack) obj).clone();
    }

    public static String get() {
        Stack stack = (Stack) a.get(Thread.currentThread());
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return ((a) stack.peek()).a;
    }

    public static int getDepth() {
        Stack stack = (Stack) a.get(Thread.currentThread());
        if (stack == null) {
            return 0;
        }
        return stack.size();
    }

    public static void inherit(Stack stack) {
        if (stack != null) {
            a.put(Thread.currentThread(), stack);
        }
    }

    public static String peek() {
        Stack stack = (Stack) a.get(Thread.currentThread());
        return (stack == null || stack.isEmpty()) ? "" : ((a) stack.peek()).b;
    }

    public static String pop() {
        Stack stack = (Stack) a.get(Thread.currentThread());
        return (stack == null || stack.isEmpty()) ? "" : ((a) stack.pop()).b;
    }

    public static void push(String str) {
        Thread threadCurrentThread = Thread.currentThread();
        Stack stack = (Stack) a.get(threadCurrentThread);
        if (stack == null) {
            a aVar = new a(str, (a) null);
            Stack stack2 = new Stack();
            a.put(threadCurrentThread, stack2);
            stack2.push(aVar);
            return;
        }
        if (stack.isEmpty()) {
            stack.push(new a(str, (a) null));
        } else {
            stack.push(new a(str, (a) stack.peek()));
        }
    }

    public static void remove() {
        int i;
        Thread thread;
        a.remove(Thread.currentThread());
        synchronized (a) {
            int i2 = b + 1;
            b = i2;
            if (i2 <= 5) {
                return;
            }
            b = 0;
            Vector vector = new Vector();
            Enumeration enumerationKeys = a.keys();
            loop0: while (true) {
                for (0; enumerationKeys.hasMoreElements() && i <= 4; i + 1) {
                    thread = (Thread) enumerationKeys.nextElement();
                    i = thread.isAlive() ? i + 1 : 0;
                }
                vector.addElement(thread);
            }
            int size = vector.size();
            for (int i3 = 0; i3 < size; i3++) {
                Thread thread2 = (Thread) vector.elementAt(i3);
                LogLog.debug("Lazy NDC removal for thread [" + thread2.getName() + "] (" + a.size() + ").");
                a.remove(thread2);
            }
        }
    }

    public static void setMaxDepth(int i) {
        Stack stack = (Stack) a.get(Thread.currentThread());
        if (stack == null || i >= stack.size()) {
            return;
        }
        stack.setSize(i);
    }
}
