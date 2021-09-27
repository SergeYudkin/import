package com.example.animport.observe;

import ru.geekbrains.socialnetwork.data.CardData;

public interface Observer {
    void updateState(CardData cardData);
}
