.class public Hello 
.super java/lang/Object 
.method public <init>()V 
aload_0 ; push this
invokespecial java/lang/Object/<init>()V ; call super 
return 
.end method
 .method public static main([Ljava/lang/String;)V 
.limit stack 2
 getstatic java/lang/System/out Ljava/io/PrintStream; 
ldc "Hello"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V 
return 
.end method 

