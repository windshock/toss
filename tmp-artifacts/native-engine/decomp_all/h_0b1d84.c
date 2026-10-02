// entry=0xb1d84

void Hb1540(undefined8 *param_1)

{
  uint uVar1;
  uint uVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined4 *unaff_x23;
  undefined8 *unaff_x27;
  
  (*(code *)*param_1)(*unaff_x19,*unaff_x20,*unaff_x23,*unaff_x27);
  (*(code *)(&DAT_0029e620)
            [(long)(int)(0x70e25751 - (-(int)DAT_00282920 ^ 0xffffffffU)) * 0x2b +
             (long)(int)(0x70e25756 - (-(int)DAT_00282920 ^ 0xffffffffU))])(*unaff_x19,*unaff_x27);
  uVar1 = -(int)DAT_00282920;
  uVar2 = -(int)DAT_00282920;
                    /* WARNING: Could not recover jumptable at 0x001b1644. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00283f28)
            ((&DAT_0029e620)
             [(long)(int)((uVar2 | 0x70e25752) * 2 - (uVar2 ^ 0x70e25752)) * 0x2b +
              (long)(int)((uVar1 ^ 0x70e25757) + (uVar1 & 0x70e25757) * 2)],*unaff_x19);
  return;
}


