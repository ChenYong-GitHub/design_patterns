package com.alibaba_tencent.design_patterns.behavior_pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteMediator
 * @Desc: 中介者模式  具体中介者
 * @Author: Chen Yong
 * @Date: 2020-04-08 15:57
 */
public class ConcreteMediator extends AbstractMediator {

    private List<AbstractColleague> colleagueList = new ArrayList<>();

    @Override
    public void register(AbstractColleague abstractColleague) {
        colleagueList.add(abstractColleague);
        abstractColleague.setMediator(this);
    }

    @Override
    public void replay(AbstractColleague abstractColleague) {
        for (AbstractColleague colleague : colleagueList) {
            if (!colleague.equals(abstractColleague)) {
                colleague.receive();
            }
        }
    }
}
