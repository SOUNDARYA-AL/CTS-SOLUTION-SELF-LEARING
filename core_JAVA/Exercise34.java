Create and Use Java Modules:

// module-info.java in com.utils: module com.utils { exports com.utils; }
// in com.greetings: requires com.utils;
