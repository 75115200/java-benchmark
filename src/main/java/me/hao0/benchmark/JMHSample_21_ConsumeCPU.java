package me.hao0.benchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * 使用Blackhole消耗CPU
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class JMHSample_21_ConsumeCPU {

    @Benchmark
    public void consume_0000() {
        Blackhole.consumeCPU(0);
    }

    @Benchmark
    public void consume_0001() {
        Blackhole.consumeCPU(1);
    }

    @Benchmark
    public void consume_0002() {
        Blackhole.consumeCPU(2);
    }

    @Benchmark
    public void consume_0004() {
        Blackhole.consumeCPU(4);
    }

    @Benchmark
    public void consume_0008() {
        Blackhole.consumeCPU(8);
    }

    @Benchmark
    public void consume_0016() {
        Blackhole.consumeCPU(16);
    }

    @Benchmark
    public void consume_0032() {
        Blackhole.consumeCPU(32);
    }

    @Benchmark
    public void consume_0064() {
        Blackhole.consumeCPU(64);
    }

    @Benchmark
    public void consume_0128() {
        Blackhole.consumeCPU(128);
    }

    @Benchmark
    public void consume_0256() {
        Blackhole.consumeCPU(256);
    }

    @Benchmark
    public void consume_0512() {
        Blackhole.consumeCPU(512);
    }

    @Benchmark
    public void consume_1024() {
        Blackhole.consumeCPU(1024);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(JMHSample_21_ConsumeCPU.class.getSimpleName())
                .warmupIterations(1)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}