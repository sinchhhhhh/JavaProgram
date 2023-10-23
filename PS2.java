package com.example.accessmodifiers;

// Public class that can be accessed from anywhere
public class PublicClass {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}

// Class with a private access modifier
class PrivateClass {
    private void privateMethod() {
        System.out.println("private method cannot be used outside of privateClass.");
    }
}

// Class with a protected access modifier
class ProtectedClass {
    protected void protectedMethod() {
        System.out.println("protectedMethod cannot be used outside of package.");
    }
}

public class Main {
	   public static void main(String[] args) {
		   // Create instances of the different classes
	   PublicClass publicObj = new PublicClass();
	   ProtectedClass protectedObj = new ProtectedClass();

	        // Access public method from the PublicClass
       publicObj.publicMethod();

	        // Access protected method from the ProtectedClass (within the same package)
       protectedObj.protectedMethod();
	   
	}
}

