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
import net.minecraftforge.common.util.EnumHelper
import net.minecraft.creativetab.CreativeTabs
import cpw.mods.fml.relauncher.{SideOnly, Side}
import net.minecraft.client.renderer.texture.IIconRegister
import net.minecraft.entity.Entity


class FishArmor(armorPart: ArmorPart)
    extends ItemArmor(FishArmor.FISH_ARMOR_MATERIAL, 0, armorPart.ID)
{
    setCreativeTab(CreativeTabs.tabCombat)
    setTextureName("fisharmor_" + armorPart.getArmorPartName)
    @SideOnly(Side.CLIENT)
    override def registerIcons(iconRegister: IIconRegister) =
    {
        val armorPartName = armorPart.getArmorPartName
        itemIcon = iconRegister.registerIcon(s"fisharmor:armor/fish_$armorPartName")
    }

//    override def getArmorTexture(stack: ItemStack, entity: Entity, slot: Int, layer: String) =
//    {
//        val suffix = if(armorType == 2) 2 else 1
//
//        s"fisharmor:textures/armor/fisharmor_layer_$suffix.png"
//    }
}

object FishArmor
{
    final val FISH_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("FishArmor", 15, Array(3, 5, 4, 3), 20)
}

object FishHelmet extends FishArmor(HelmetPart)
{
    setUnlocalizedName("fishHelmet")
}

object FishChestplate extends FishArmor(ChestplatePart)
{
    setUnlocalizedName("fishChestplate")
}

object FishLeggings extends FishArmor(LeggingsPart)
{
    setUnlocalizedName("fishLeggings")
}

object FishBoots extends FishArmor(BootsPart)
{
    setUnlocalizedName("fishBoots")
}