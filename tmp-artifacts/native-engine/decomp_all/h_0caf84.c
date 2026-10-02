// entry=0xcaf84

void Hca720(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined **ppuVar1;
  uint uVar2;
  long lVar3;
  
  uVar2 = -(int)DAT_00281748;
  lVar3 = (*(code *)(&PTR_FUN_0027c1e0)
                    [(long)(int)((uVar2 ^ 0xde8ac507) + (uVar2 & 0xde8ac507) * 2) * 300 +
                     (long)(int)(-0x21753a24 - (-(int)DAT_00281748 ^ 0xffffffffU))])(param_3);
  ppuVar1 = (undefined **)&DAT_00282578;
  if (lVar3 != 0) {
    ppuVar1 = &PTR_LAB_00274428;
  }
                    /* WARNING: Could not recover jumptable at 0x001ca7dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)(-(int)DAT_00281748 & 0xde8ac507);
  return;
}


