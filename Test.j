.source Test.java
.class Test
.super java/lang/Object

.method <init>()V
.limit stack 1
.limit locals 1
.var 0 is this LTest; from Label0 to Label1

Label0:
.line 1
    aload_0
    invokespecial java/lang/Object/<init>()V
Label1:
    return
.end method

.method fi(II)I
.limit stack 2
.limit locals 3
.var 0 is this LTest; from Label1 to Label2
.var 1 is arg0 I from Label1 to Label2
.var 2 is arg1 I from Label1 to Label2

Label1:
.line 4
    iload_1
    iload_2
    if_icmpge Label0
.line 5
    iconst_1
    goto Label2
Label0:
.line 7
    iconst_2
Label2:
    ireturn
.end method

.method ff(FZ)Z
.limit stack 4
.limit locals 3
.var 0 is this LTest; from Label3 to Label4
.var 1 is arg0 F from Label3 to Label4
.var 2 is arg0 Z from Label3 to Label4

Label3:
.line 11
    fload_1
    f2d
    dconst_1
    dcmpl
    iflt Label0
    iload_2
    ifeq Label0
.line 12
    iload_2
    ireturn
Label0:
.line 14
    iload_2
    ifne Label1
    iconst_1
    goto Label4
Label1:
    iconst_0
Label4:
    ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 4
.limit locals 2
.var 0 is arg0 [Ljava/lang/String; from Label0 to Label1
Label0:
.line 19
    new Test
    dup
    invokespecial Test/<init>()V
    astore_1
.line 20
    getstatic java.lang.System.out Ljava/io/PrintStream;
    aload_1
    iconst_1
    iconst_2
    invokevirtual Test/fi(II)I
    invokevirtual java/io/PrintStream/println(I)V
.line 21
    getstatic java.lang.System.out Ljava/io/PrintStream;
    aload_1
    fconst_2
    iconst_1
    invokevirtual Test/ff(FZ)Z
    invokevirtual java/io/PrintStream/println(Z)V
Label1:
.line 22
    return
.end method
