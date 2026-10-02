// entry=0x86d74

void H86d74(void)

{
  uint uVar1;
  long lVar2;
  
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
             (long)(int)(-0x6b073d07 - (-(int)DAT_00274480 ^ 0xffffffffU))])();
  (*(code *)(&DAT_0029e620)
            [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
             (long)(int)(-0x6b073d08 - (-(int)DAT_00274480 ^ 0xffffffffU))])();
  uVar1 = -(int)DAT_00274480;
  lVar2 = (*(code *)(&DAT_0029e620)
                    [(long)(int)(-0x6b073d0f - (-(int)DAT_00274480 ^ 0xffffffffU)) * 0x2b +
                     (long)(int)((uVar1 | 0x94f8c307) + (uVar1 & 0x94f8c307))])();
                    /* WARNING: Could not recover jumptable at 0x0018124c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00280a30)(lVar2 == 0);
  return;
}


