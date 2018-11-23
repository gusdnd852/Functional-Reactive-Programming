package impements.subscriber;

import impements.subscription.Subscription;

/**
 * @Author : Hyunwoong
 * @When : 2018-11-23 오후 9:56
 * @Homepage : https://github.com/gusdnd852
 */
public interface Subscriber<T> {
    void onError(Throwable throwable);

    void onComplete();

    void onSubscribe(Subscription subscription);

    void onNext(T input);
}
