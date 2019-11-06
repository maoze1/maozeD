package com.example.synclock.ConcurrentResolution.concurrency;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: maoze@hsyuntai.com
 * Date: 2019-11-06
 * Time: 9:15
 */
public class ThreadPool {

    /**
     *
     *  线程池
     * callable  和 future
     * */

    /**
     * Creates a new {@code ThreadPoolExecutor} with the given initial
     * parameters.
     *
     * @param corePoolSize 核心线程数
     * @param maximumPoolSize 池中允许的最大线程数
     * @param keepAliveTime 当线程的数量大于内核时，这是多余的空闲线程在终止之前等待新任务的最大时间。
     * @param unit 参数{@code keepAliveTime}的时间单位
     * @param workQueue 用于在任务之前保存它们的队列执行。这个队列将只包含{@code execute}方法提交的{@code可运行任务。
     * @param threadFactory 执行程序创建新线程时使用的工厂
     * @param handler 当执行被阻塞时使用的处理程序，因为达到了线程边界和队列容量
     * @throws IllegalArgumentException if one of the following holds:<br>
     *         {@code corePoolSize < 0}<br>
     *         {@code keepAliveTime < 0}<br>
     *         {@code maximumPoolSize <= 0}<br>
     *         {@code maximumPoolSize < corePoolSize}
     * @throws NullPointerException if {@code workQueue}
     *         or {@code threadFactory} or {@code handler} is null
     */
    private static ExecutorService pool;
    public static void main(String[] args) {
        //maximumPoolSize设置为2 ，拒绝策略为AbortPolic策略，直接抛出异常
        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS, new SynchronousQueue<Runnable>(), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        for(int i=0;i<3;i++) {
            pool.execute(new ThreadTask());
        }


    }


//1	corePoolSize	int	核心线程池大小
//2	maximumPoolSize	int	最大线程池大小
//3	keepAliveTime	long	线程最大空闲时间
//4	unit	TimeUnit	时间单位
//5	workQueue	BlockingQueue<Runnable>	线程等待队列
//6	threadFactory	ThreadFactory	线程创建工厂
//7	handler	RejectedExecutionHandler	拒绝策略



}



