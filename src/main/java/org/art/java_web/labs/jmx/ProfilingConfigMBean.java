package org.art.java_web.labs.jmx;

/**
 * JMX MBean Profiling Configuration interface.
 */
public interface ProfilingConfigMBean {

    void setEnabledProfiling(boolean enabledProfiling);

    boolean isEnabledProfiling();

    void printStatus();
}
