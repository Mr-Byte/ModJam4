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

package com.theenginerd.fisharmor.common.item

import net.minecraft.item.{ItemStack, ItemArmor}
import net.minecraftforge.common.ISpecialArmor
import net.minecraft.item.ItemArmor.ArmorMaterial
import net.minecraft.entity.EntityLivingBase
import net.minecraft.util.DamageSource
import net.minecraftforge.common.ISpecialArmor.ArmorProperties
import net.minecraft.entity.player.EntityPlayer

//TODO: replace this int with a case class?
class FishArmor(armorPart: Int)
    extends ItemArmor(ArmorMaterial.CHAIN, 0, armorPart)
    with ISpecialArmor
{
    override def getProperties(player: EntityLivingBase, armor: ItemStack, source: DamageSource, damage: Double, slot: Int): ArmorProperties = ???

    override def getArmorDisplay(player: EntityPlayer, armor: ItemStack, slot: Int): Int = ???

    override def damageArmor(entity: EntityLivingBase, stack: ItemStack, source: DamageSource, damage: Int, slot: Int): Unit = ???
}
