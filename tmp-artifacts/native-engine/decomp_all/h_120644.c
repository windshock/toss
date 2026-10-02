// entry=0x120644

void H120644(void)

{
  char *pcVar1;
  undefined **ppuVar2;
  uint uVar3;
  uint uVar4;
  ulong uVar5;
  undefined8 uVar6;
  char *unaff_x23;
  
  uVar5 = 0;
  do {
    pcVar1 = unaff_x23 + uVar5;
    uVar5 = (uVar5 | 1) * 2 - (uVar5 ^ 1);
  } while (*pcVar1 != (byte)('A' - (-(char)DAT_00281e58 ^ 0xffU)));
  uVar3 = -(int)DAT_00281e58;
  uVar4 = -(int)DAT_00281e58;
  uVar6 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar3 ^ 0xcc88cf42) + (uVar3 & 0xcc88cf42) * 2) * 300 +
                     (long)(int)((uVar4 ^ 0xcc88d057) + (uVar4 & 0xcc88d057) * 2)])();
  ppuVar2 = &PTR_LAB_002794e8;
  if (*unaff_x23 != '\0') {
    ppuVar2 = &PTR_LAB_00275200;
  }
                    /* WARNING: Could not recover jumptable at 0x00221454. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(uVar6);
  return;
}


