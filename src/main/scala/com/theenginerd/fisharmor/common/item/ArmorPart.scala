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

sealed abstract class ArmorPart
{
    val ID: Integer

    def getArmorPartName =
    {
        this match
        {
            case HelmetPart => "helmet"
            case ChestplatePart => "chestplate"
            case LeggingsPart => "leggings"
            case BootsPart => "boots"
        }
    }
}


case object HelmetPart extends ArmorPart { override val ID: Integer = 0 }
case object ChestplatePart extends ArmorPart { override val ID: Integer = 1 }
case object LeggingsPart extends ArmorPart { override val ID: Integer = 2 }
case object BootsPart extends ArmorPart { override val ID: Integer = 3 }

