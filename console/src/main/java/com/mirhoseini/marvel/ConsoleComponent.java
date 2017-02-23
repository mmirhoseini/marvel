package com.mirhoseini.marvel;

import com.mirhoseini.marvel.character.search.SearchModule;
import com.mirhoseini.marvel.character.search.SearchSubComponent;
import com.mirhoseini.marvel.storage.DatabaseModule;
import com.mirhoseini.marvel.network.client.ApiModule;
import com.mirhoseini.marvel.network.client.ClientModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mohsen on 20/10/2016.
 */

@Singleton
@Component(modules = {
        ConsoleModule.class,
        ApiModule.class,
        ClientModule.class,
        DatabaseModule.class,
})
public interface ConsoleComponent {

    void inject(MainClass main);

    SearchSubComponent plus(SearchModule module);

}