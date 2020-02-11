package com.gonggongjohn.manorlife.capabilities;

import com.gonggongjohn.manorlife.handlers.CapabilityHandler;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CapabilityNutritions {
    public static class Storage implements Capability.IStorage<INutritions>{

        @Nullable
        @Override
        public NBTBase writeNBT(Capability<INutritions> capability, INutritions instance, EnumFacing side) {
            NBTTagCompound compound = new NBTTagCompound();
            compound.setInteger("carbohydrate", instance.getCarbohydrateValue());
            compound.setInteger("fat", instance.getFatValue());
            compound.setInteger("protein", instance.getProteinValue());
            compound.setInteger("vitamin", instance.getVitaminValue());
            compound.setInteger("mineral", instance.getMineralValue());
            return compound;
        }

        @Override
        public void readNBT(Capability<INutritions> capability, INutritions instance, EnumFacing side, NBTBase nbt) {
            NBTTagCompound compound = (NBTTagCompound) nbt;
            int chV = 1000, fV = 1000, pV = 1000, vV = 1000, mV = 1000;
            if(compound.hasKey("carbohydrate")) chV = compound.getInteger("carbohydrate");
            if(compound.hasKey("fat")) fV = compound.getInteger("fat");
            if(compound.hasKey("protein")) pV = compound.getInteger("protein");
            if(compound.hasKey("vitamin")) vV = compound.getInteger("vitamin");
            if(compound.hasKey("mineral")) mV = compound.getInteger("mineral");
            instance.setCarbohydrateValue(chV);
            instance.setFatValue(fV);
            instance.setProteinValue(pV);
            instance.setMineralValue(mV);
            instance.setVitaminValue(vV);
        }
    }

    public static class Implementation implements INutritions{
        private int chV = 1000, fV = 1000, pV = 1000, vV = 1000, mV = 1000;

        @Override
        public int getCarbohydrateValue() {
            return this.chV;
        }

        @Override
        public int getFatValue() {
            return this.fV;
        }

        @Override
        public int getProteinValue() {
            return this.pV;
        }

        @Override
        public int getVitaminValue() {
            return this.vV;
        }

        @Override
        public int getMineralValue() {
            return this.mV;
        }

        @Override
        public void setCarbohydrateValue(int carbohydrateValue) {
            this.chV = carbohydrateValue;
        }

        @Override
        public void setFatValue(int fatValue) {
            this.fV = fatValue;
        }

        @Override
        public void setProteinValue(int proteinValue) {
            this.pV = proteinValue;
        }

        @Override
        public void setVitaminValue(int vitaminValue) {
            this.vV = vitaminValue;
        }

        @Override
        public void setMineralValue(int mineralValue) {
            this.mV = mineralValue;
        }
    }

    public static class ProvidePlayer implements ICapabilitySerializable<NBTTagCompound>, ICapabilityProvider{
        private INutritions nutritions = new Implementation();
        private Capability.IStorage<INutritions> storage = CapabilityHandler.capNutritions.getStorage();

        @Override
        public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing) {
            return CapabilityHandler.capNutritions.equals(capability);
        }

        @Nullable
        @Override
        public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing) {
            if(CapabilityHandler.capNutritions.equals(capability)){
                @SuppressWarnings("unchecked")
                        T result = (T) nutritions;
                return result;
            }
            return null;
        }

        @Override
        public NBTTagCompound serializeNBT() {
            NBTTagCompound compound = new NBTTagCompound();
            compound.setTag("nutritions", storage.writeNBT(CapabilityHandler.capNutritions, nutritions, null));
            return compound;
        }

        @Override
        public void deserializeNBT(NBTTagCompound nbt) {
            NBTTagCompound compound = nbt.getCompoundTag("nutritions");
            storage.readNBT(CapabilityHandler.capNutritions, nutritions, null, compound);
        }
    }
}
