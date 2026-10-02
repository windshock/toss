// entry=0x15dc5c

void H15dc5c(void)

{
  undefined **ppuVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  long unaff_x19;
  undefined8 unaff_x20;
  int unaff_w24;
  
  uVar4 = -(int)DAT_00285720;
  uVar2 = -(int)DAT_00285720;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar4 | 0x4b98a2a0) * 2 - (uVar4 ^ 0x4b98a2a0)) * 0x2b +
             (long)(int)((uVar2 | 0x4b98a2c2) * 2 - (uVar2 ^ 0x4b98a2c2))])();
  iVar3 = (int)DAT_00285720;
  *(undefined8 *)(unaff_x19 + 0x70) = unaff_x20;
  uVar4 = (uint)((int)(0x4b98a29f - (-iVar3 ^ 0xffffffffU)) < unaff_w24);
  *(uint *)(unaff_x19 + 0x5c) = uVar4;
  ppuVar1 = &PTR_H159db8_0027ec50;
  if (uVar4 == 0) {
    ppuVar1 = &PTR_LAB_002791b0;
  }
                    /* WARNING: Could not recover jumptable at 0x0025b504. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


