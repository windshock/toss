// entry=0x8bb7c

void FUN_00186a28(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  long unaff_x29;
  
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar1 | 0x94f8c2f2) * 2 - (uVar1 ^ 0x94f8c2f2)) * 300 +
             (long)(int)((uVar2 | 0x94f8c342) * 2 - (uVar2 ^ 0x94f8c342))])();
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  uVar3 = *(undefined8 *)(unaff_x29 + -0x120);
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar2 | 0x94f8c2f2) + (uVar2 & 0x94f8c2f2)) * 0x2b +
             (long)(int)((uVar1 | 0x94f8c30c) + (uVar1 & 0x94f8c30c))])(uVar3);
  uVar1 = -(int)DAT_00274480;
  uVar2 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)((uVar1 ^ 0x94f8c2f2) + (uVar1 & 0x94f8c2f2) * 2) * 0x2b +
             (long)(int)((uVar2 | 0x94f8c2f7) + (uVar2 & 0x94f8c2f7))])(uVar3);
  uVar1 = -(int)DAT_00274480;
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((uVar1 ^ 0x94f8c2f7) + (uVar1 & 0x94f8c2f7) * 2)])
            (uVar3,*(undefined8 *)(unaff_x29 + -0x298));
  uVar1 = -(int)DAT_00274480;
                    /* WARNING: Could not recover jumptable at 0x00186c70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00285880)
            (&DAT_0029e620 +
             (long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
             (long)(int)((uVar1 ^ 0x94f8c2f7) + (uVar1 & 0x94f8c2f7) * 2));
  return;
}


