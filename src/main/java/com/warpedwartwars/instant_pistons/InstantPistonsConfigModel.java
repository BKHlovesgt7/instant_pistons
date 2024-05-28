package com.warpedwartwars.instant_pistons;

//addipmorts
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.RangeConstraint;

@Modmenu(modId = "instant_pistons")
@Config(name="instant_pistons_config", wrapperName="InstantPistonsConfig")
public class InstantPistonsConfigModel {
    //@Comment("time it takes for pistons to extend, in ticks. 0 means pistons will be fully extended the tick they are powered. vanilla default is 2")
    @RangeConstraint(min=0,max=Integer.MAX_VALUE)
    public int pistonExtendTicks = 0;
}
