// entry=0x9aac8

void H99f8c(ulong param_1)

{
  char *pcVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  ulong uVar5;
  char *unaff_x20;
  
  do {
    pcVar1 = unaff_x20 + param_1;
    uVar5 = 0x2e00d84656e407c0 - (-DAT_0027fb18 ^ 0xffffffffffffffffU);
    param_1 = (param_1 | uVar5) * 2 - (param_1 ^ uVar5);
  } while (*pcVar1 != '\0');
  uVar3 = -(int)DAT_0027fb18;
  uVar4 = -(int)DAT_0027fb18;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)((uVar3 | 0x56e407c0) * 2 - (uVar3 ^ 0x56e407c0)) * 300 +
             (long)(int)((uVar4 | 0x56e408d5) + (uVar4 & 0x56e408d5))])();
  ppuVar2 = &PTR_LAB_00278db8;
  if (*unaff_x20 != '\0') {
    ppuVar2 = &PTR_LAB_00281d00;
  }
                    /* WARNING: Could not recover jumptable at 0x001a43b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)();
  return;
}


