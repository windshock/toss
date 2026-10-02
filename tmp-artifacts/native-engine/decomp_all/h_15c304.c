// entry=0x15c304

void H15c304(void)

{
  uint uVar1;
  uint uVar2;
  long unaff_x19;
  undefined4 unaff_w24;
  undefined8 unaff_x25;
  undefined1 auStack_880 [2112];
  undefined1 auStack_40 [32];
  undefined1 auStack_20 [32];
  
  *(undefined8 *)(unaff_x19 + 0x78) = unaff_x25;
  *(undefined4 *)(unaff_x19 + 0x8c) = unaff_w24;
  *(undefined1 **)(unaff_x19 + 0x50) = auStack_20;
  *(undefined1 **)(unaff_x19 + 0x48) = auStack_40;
  *(undefined1 **)(unaff_x19 + 0x68) = auStack_880;
  *(undefined1 **)(unaff_x19 + 0x80) = auStack_880;
  uVar1 = -(int)DAT_00285720;
  uVar2 = -(int)DAT_00285720;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0x4b98a2a0) + (uVar2 & 0x4b98a2a0)) * 0x2b +
             (long)(int)((uVar1 ^ 0x4b98a2a2) + (uVar1 & 0x4b98a2a2) * 2)])();
                    /* WARNING: Could not recover jumptable at 0x0025d390. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&PTR_LAB_0027f460)[(int)(0x4b98a2fd - (-(int)DAT_00285720 ^ 0xffffffffU))])(0x1256);
  return;
}


