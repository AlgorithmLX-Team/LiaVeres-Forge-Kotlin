package com.algorithmlx.liaveres.item

import com.algorithmlx.liaveres.LiaVeresKotlin
import com.algorithmlx.liaveres.api.LVItemTiers
import com.algorithmlx.liaveres.setup.Tabs.*
import net.minecraft.client.util.ITooltipFlag
import net.minecraft.item.HoeItem
import net.minecraft.item.ItemStack
import net.minecraft.util.text.ITextComponent
import net.minecraft.util.text.TranslationTextComponent
import net.minecraft.world.World

class MatterCrystalHoe :
    HoeItem(LVItemTiers.MATTER_CRYSTAL, 2147483647,340282356779733661637539395458142568447F, Properties().fireResistant().tab(LVTab)) {
    override fun hasContainerItem(stack: ItemStack?): Boolean {
        return true
    }

    override fun getContainerItem(itemStack: ItemStack?): ItemStack {
        return itemStack!!.copy()
    }
    override fun appendHoverText(p_77624_1_: ItemStack, p_77624_2_: World?, p_77624_3_: MutableList<ITextComponent>, p_77624_4_: ITooltipFlag) {
        p_77624_3_.add(TranslationTextComponent("msg.${LiaVeresKotlin.Constants.ModId}.matter_crystal_msg"))
    }
}