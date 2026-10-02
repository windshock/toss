// entry=0xaf668

void Hae848(void)

{
  uint uVar1;
  uint uVar2;
  void *unaff_x25;
  
  memset(unaff_x25,0,0x10);
  uVar1 = -(int)DAT_0027fb18;
  uVar2 = -(int)DAT_0027fb18;
                    /* WARNING: Could not recover jumptable at 0x001ae8c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*DAT_0027f638)((&PTR_FUN_0027c1e0)
                  [(long)(int)((uVar2 ^ 0x56e407c0) + (uVar2 & 0x56e407c0) * 2) * 300 +
                   (long)(int)((uVar1 | 0x56e408b2) + (uVar1 & 0x56e408b2))]);
  return;
}


