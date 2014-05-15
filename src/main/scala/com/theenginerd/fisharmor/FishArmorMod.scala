/*
 * Copyright 2014 Joshua R. Rodgers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.theenginerd.fisharmor

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}

@Mod(name = "FishArmor", modid="fisharmor", version="1.0.0-1.7.2", modLanguage = "scala")
object FishArmorMod
{
    @EventHandler
    def preInit(event: FMLPreInitializationEvent) = {}

    @EventHandler
    def init(event: FMLInitializationEvent) = {}

    @EventHandler
    def postInit(event: FMLPostInitializationEvent) = {}
}
