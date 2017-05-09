/* Android StrictMode helps you to detect different kinds of problems:
closable object is not closed
file reading / network requests performed on main thread
uri exposed
…
Whenever such problem is detected it can show you appropriate log or crash your application, depending on your configuration.
I suggest you to turn it on only for debug build and use detectAll methods to detect all kind of problems. */

public class TemplateApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
        }
    }
}
